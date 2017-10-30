package wang.congjun.spring.Spring003_Configuration.value;

//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by wangcongjun on 2017/6/23.
 */
@ComponentScan
@SpringBootApplication
public class ValueApp {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ValueApp.class);
        applicationContext.getBean(ValueProperties.class).hello();
    }

}
