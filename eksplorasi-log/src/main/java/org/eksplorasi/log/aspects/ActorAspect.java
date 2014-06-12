package org.eksplorasi.log.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ActorAspect {
	
	static final Logger logger = LoggerFactory.getLogger(ActorAspect.class);
	
	//@Pointcut("execution(public * org.ventus.chimpanzee.web.controller.BukuUjianController.getBukuUjian(String)) && args(name)")
        @Before("execution(public * org.eksplorasi.web.controller.ActorController.getActor(..))")
	public void findByFirstNameAdvice() {
            logger.debug("Buku Ujian Service, method findByName with query parameter called");
	}
}
