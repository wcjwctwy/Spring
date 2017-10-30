package cn.sf80.thymeleaf.fragment;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FragmentController {

    @RequestMapping("/index/{content}")
    public String index(Model model,  String template, @PathVariable String content){
        model.addAttribute("template",template);
        model.addAttribute("content",content);
        return "index";
    }
}
