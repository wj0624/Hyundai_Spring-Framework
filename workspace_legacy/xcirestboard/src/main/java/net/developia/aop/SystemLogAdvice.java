package net.developia.aop;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import lombok.extern.java.Log;

@Aspect
@Log
@Component
public class SystemLogAdvice {

	@AfterThrowing(
			pointcut = "execution(* net.developia.service.BoardService*.*(..))", 
			throwing="exception")
	public void logException(Exception exception) {
		log.info("=====================");
		log.info(exception.getMessage());
		log.info("=====================");
	}
	
}
