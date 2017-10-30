package wang.congjun.spring.Spring003_Configuration.value;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * Created by wangcongjun on 2017/6/23.
 */
@Configuration
@Component
@PropertySource("classpath:aaa.properties")
public class ValueProperties {
    @Value("${my.name}")
    private String name;
    @Value("${my.age}")
    private Integer age;
    public void hello(){
        System.out.println("my name : "+name+"| age: "+age);
    }
}
