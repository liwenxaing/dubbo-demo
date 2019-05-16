package top.liwenxiang.oa.aop;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class IStaffAopAspectJ {

    @Before("pointCut()")
    public void before(){
        System.out.println("进行IStaffAopAspectJ增强.......前置方法......通知");
    }

    @AfterReturning(value = "pointCut()",returning = "result")
    public void afterReturning(Object result){
        System.out.println("进行IStaffAopAspectJ增强.......后置方法......通知 -- 返回值 [" +result);
    }

    @Around("pointCut()")
    public Object around(ProceedingJoinPoint rjp) throws Throwable {
        System.out.println("进行IStaffAopAspectJ增强.......环绕前........通知");
        Object proceed = rjp.proceed();
        System.out.println("进行IStaffAopAspectJ增强.......环绕后........通知");
        return proceed;
    }

    @AfterThrowing(value = "pointCut()",throwing = "ex")
    public void throwAble(Exception ex){
        System.out.println("进行IStaffAopAspectJ增强........发生错误......通知 + Message :" + ex.getMessage());
    }

    @After(value = "pointCut()")
    public void myAfter(){
        System.out.println("进行IStaffAopAspectJ增强.......最终增强......通知");
    }

    @Pointcut("execution(* *..serviceImpl..*(..))")
    private void pointCut(){ }

}
