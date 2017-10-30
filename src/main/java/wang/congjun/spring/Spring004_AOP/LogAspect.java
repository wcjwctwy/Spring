package wang.congjun.spring.Spring004_AOP;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * 编写切面
 */
@Aspect //申明一个切面
@Component //让此类成为Spring管理的bean
public class LogAspect {
    @Pointcut("@annotation(wang.congjun.spring.Spring004_AOP.Action)") //声明切点
    public void annotationPointCut(){}

    @After("annotationPointCut()") //声明建言 并使用@Pointcut定义的切点
    public void after(JoinPoint joinPoint){
        MethodSignature signature = (MethodSignature)joinPoint.getSignature();
        Method  method = signature.getMethod();
        Action action =method.getAnnotation(Action.class);
        System.out.println("注解式拦截"+action.name()); //通过反射获取注解上的属性 做日志相关的操作
    }

    @Before("execution(* wang.congjun.spring.Spring004_AOP.DemoAnnotationService.*(..))")
    //声明建言 直接使用拦截规则作为参数
    public void before(JoinPoint joinPoint){
        MethodSignature signature = (MethodSignature)joinPoint.getSignature();
        Method method = signature.getMethod();
        System.out.println("方法规则式拦截："+method.getName());
    }
}
