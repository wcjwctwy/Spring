package wang.congjun.spring.Spring001;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import wang.congjun.spring.Spring.MyConfig;
import wang.congjun.spring.Spring.Pojo;

/**
 * Created by wangcongjun on 2017/6/12.
 */
public class HelloWorld {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        PojoServer pojoServer = context.getBean(PojoServer.class);
        pojoServer.savePojo();
    }
}
