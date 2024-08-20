package GreetingAppLifecycle.GreetingAppLifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // Initializing the spring container
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        
    	//AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext()
    	
        // request the spring context
    	FortuneService f = context.getBean("englishFortuneService", FortuneService.class);
    	
    	// calling the business logic - get my daily fortune
    	System.out.println("getFortune() called: "+f.getFortune());	
    	
  
    	
    	// close the spring application context
    	context.close();
    }
}
