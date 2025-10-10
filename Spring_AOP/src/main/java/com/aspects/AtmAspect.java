package com.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class AtmAspect {

	@Before("execution (* com.entity.ATM.*(..)) ")
	public void beforeWidraw()
	{
		System.out.println("Begin Transaction ");
	}
	
	@After("execution (* com.entity.ATM.*(..)) ")
	public void afterWidraw()
	{
		System.out.println("Thank you for visiting ");
	}
}
