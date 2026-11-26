package in.strikes.SpringAOPPointcut.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class ApplicationPointCuts {

    @Pointcut("within(in.strikes.SpringAOPPointcut.service..*) " +
            "&& execution(public * *(..))")
    public void serviceLayerPointcut(){
        //empty body
    }

    @Pointcut("within(in.strikes.SpringAOPPointcut.controler..*) " +
            "&& execution(public * *(..))")
    public void controlerLayerPointcut(){
        //empty body
    }
}
