package org.ncu.GreetingMaven;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */

// Dependent Class
public class MainApp 
{
    public static void main( String[] args )
    {
		/*
		 * FactoryGreetingService factory = new FactoryGreetingService();
		 * GreetingService service = factory.greetingService("eng");
		 * service.greet("John");
		 * 
		 * FactoryFortuneService factory2 = new FactoryFortuneService(); FortuneService
		 * service2 = factory2.fortuneService("eng"); service2.tellFortune("John");
		 */
    	
    	// Step 1: Initialize the spring container
		/*
		 * ClassPathXmlApplicationContext context = new
		 * ClassPathXmlApplicationContext("spring.xml");
		 */
    	
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AnnotationConfig.class);
    	
    	// Step 2: Get the desired bean
    	GreetingService service = context.getBean("frenchGreetingService", GreetingService.class);
    
    	// Step 3: Perform the required operation
    	service.greet("Sumit");
    	
    	// Step 4: close the context
    	context.close();
    }
}
