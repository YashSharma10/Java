package org.ncu.GreetingMaven;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {

	public static void main(String[] args) {
		// Step 1: initialize the spring container

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

//		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AnnotationConfig.class);

		// Step 2: get the desired bean --> id, type
		GreetingService service = context.getBean("engGreeting", GreetingService.class);

		// Step 3: Perform the desired operation
		service.greet("John");

		service.fortune("John");

		// Step 4: close the context
		context.close();
	}

}