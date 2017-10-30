package wang.congjun.spring.Spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import wang.congjun.spring.Spring001.PojoServer;

/**
 * Created by wangcongjun on 2017/6/12.
 */
@Configuration
//@ComponentScan("wang.congjun.spring")
public class MyConfig {
    @Bean
    public Pojo pojo() {
        return new Pojo(45, "susan");
    }

    @Bean
    public PojoServer pojoServer() {
        PojoServer ps = new PojoServer();
//        ps.setPojo(pojo());
        return ps;
    }
}
