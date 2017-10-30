package wang.congjun.spring.Spring004_AOP;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AopApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfug.class);
        DemoAnnotationService demoAnnotationService = context.getBean(DemoAnnotationService.class);
        DemoMethodService demoMethodService = context.getBean(DemoMethodService.class);
        demoAnnotationService.add();
        demoMethodService.add();
        MyExample myExample = context.getBean(MyExample.class);
        myExample.test();
        context.close();
    }
}
