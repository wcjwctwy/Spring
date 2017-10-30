package wang.congjun.spring.Spring004_AOP;

import org.springframework.stereotype.Service;


@Service
public class DemoAnnotationService {
    @Action(name = "注解式拦截add操作")
    public void add(){}
}
