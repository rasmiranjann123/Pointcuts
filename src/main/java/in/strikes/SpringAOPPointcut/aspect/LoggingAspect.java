package in.strikes.SpringAOPPointcut.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

//    @Before("execution(* in.strikes.SpringAOPPointcut.service.StudentService.*(..))")
//    public void logBeforeMethod(){
//
//        System.out.println("Method Intercepted.......");
//    }

//    @Before("within(in.strikes.SpringAOPPointcut.service.StudentService)")
//    public void logBeforeMethod(){
//
//        System.out.println("Method Intercepted.......");
//    }



//    @Before("@annotation(jdk.jfr.Timestamp)")
//    public void logBeforeMethod(){
//
//        System.out.println("Method Intercepted.......");
//    }

//        @Before("bean(studentService)")
//    public void logBeforeMethod(){
//
//        System.out.println("Method Intercepted.......");
//    }


//    @Before("within(in.strikes.SpringAOPPointcut.service..*) " +
//            "&& execution(public * *(..))")
//    public void logBeforeMethod(){
//
//        System.out.println("Method Intercepted.......");
//    }


//    @Pointcut("within(in.strikes.SpringAOPPointcut.service..*) " +
//            "&& execution(public * *(..))")
//    public void logpublicServicePointCut(){
//        //empty body
//    }

//    @Before("logpublicServicePointCut()")
//    public void logBeforeMethod(){
//
//        System.out.println("Method Intercepted.......");
//    }
//
//
//    @After("logpublicServicePointCut()")
//    public void logAftereMethod(){
//
//        System.out.println("COMPLETED.......");
//    }


    @Before("in.strikes.SpringAOPPointcut.aspect.ApplicationPointCuts.serviceLayerPointcut()")
    public void logBeforeMethod(){

        System.out.println("Method Intercepted.......");
    }


//    @Before("execution(in.strikes.SpringAOPPointcut.dto.Student in.strikes.SpringAOPPointcut." +
//            "service.StudentService.createStudent(in.strikes.SpringAOPPointcut.dto.Student))")
//    public void logBeforeMethod2(){
//
//        System.out.println("Method Intercepted...");
//    }
}
