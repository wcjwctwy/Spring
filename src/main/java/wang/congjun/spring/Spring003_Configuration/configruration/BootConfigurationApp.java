package wang.congjun.spring.Spring003_Configuration.configruration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by wangcongjun on 2017/6/24.
 */
@ComponentScan
@EnableAutoConfiguration
//@SpringBootApplication
public class BootConfigurationApp {


    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BootConfigurationApp.class);
        applicationContext.getBean(BootConfiguration.class).hello();
//        SpringApplication.run(BootConfigurationApp.class,args);
    }
}
