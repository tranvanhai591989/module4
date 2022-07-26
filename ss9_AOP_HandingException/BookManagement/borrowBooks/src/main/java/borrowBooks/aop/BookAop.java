package borrowBooks.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class BookAop {
    @Pointcut(value = "execution(borrowBooks.controller.BooksController.*)")
    public void  bookPointCut(){

    }
}
