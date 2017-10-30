package wang.congjun.spring.Spring003_Configuration.configruration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * Created by wangcongjun on 2017/6/24.
 */
@Component
@ConfigurationProperties( prefix = "server.my",locations = "aaa.yaml")
//@PropertySource("classpath:aaa.yaml") 不支持yml 指支持prop
public class BootConfiguration {
//    @Value("${server.my.name}")
    private String name;
    private Integer age;
    public void hello(){
        System.out.println("my name : "+name+"| age: "+age);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
