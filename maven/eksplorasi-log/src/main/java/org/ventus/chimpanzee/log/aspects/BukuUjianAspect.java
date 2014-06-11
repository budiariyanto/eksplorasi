package org.ventus.chimpanzee.log.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class BukuUjianAspect {
	
	static final Logger logger = LoggerFactory.getLogger(BukuUjianAspect.class);
	
	//@Pointcut("execution(public * org.ventus.chimpanzee.web.controller.BukuUjianController.getBukuUjian(String)) && args(name)")
        @Before("execution(public * org.ventus.chimpanzee.web.controller.BukuUjianController.getBukuUjian(..))")
	public void findByNameAdvice() {
            System.out.println("UYGUYTTI");
            logger.debug("Buku Ujian Service, method findByName with query parameter called");
	}
}
