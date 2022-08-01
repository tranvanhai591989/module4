package borrowBooks.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@Aspect
public class BookAop {
    int count = 0 ;
    @Pointcut("execution(* borrowBooks.controller.BooksController.*(..))")
    public void allMethodPointCut() {
    }

    @After("allMethodPointCut()")
    public void afterCallMethod() {
        count ++;
        System.err.println("Đã truy cập lúc :  " + LocalDateTime.now()+ "với số lần là : "+ count);
    }
}