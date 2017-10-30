package cn.sf80.mail.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import javax.mail.internet.MimeMessage;
import java.io.StringWriter;

@RestController
public class JavaMailController {


    private String sender = "708808508@qq.com";


    private String mailTemplate = "mail";

    @Autowired
    private TemplateEngine templateEngine;
    @Autowired
    private JavaMailSender mailSender; //自动注入的Bean
    @Value("${spring.mail.username}")
    private String Sender; //读取配置文件中的参数

    @RequestMapping("/mail/send")
    public void sendSimpleMail() throws Exception {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(Sender);
        message.setTo(Sender); //自己给自己发送邮件
        message.setSubject("主题：简单邮件");
        message.setText("测试邮件内容");
        mailSender.send(message);
    }
    @RequestMapping("/mail/template")
    public void sendTemplateMail() {
        String receiver = sender;
        MimeMessage message = null;
        try {
            message = mailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message, true);
            helper.setFrom(sender);
            helper.setTo(receiver);
            helper.setSubject("主题：模板邮件");
            StringWriter result = new StringWriter();
            Context context = new Context();
            context.setVariable("active_url","http://www.sf80.cn");
            templateEngine.process(mailTemplate, context, result);
            String html = result.toString();
            helper.setText(html, true);
        } catch (Exception e) {
            e.printStackTrace();
        }
        mailSender.send(message);
    }

}
