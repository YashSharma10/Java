package GreetingAppLifecycle.GreetingAppLifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class EnglishFortuneService implements FortuneService {

	
	
	  public EnglishFortuneService() { 
		  System.out.println("Inside Constructor: This will be called when a bean of type FortuneService gets created!"); 
	  }
	 
	
	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "Today is your lucky day!";
	}
	
	  @PostConstruct
	  public void doInitializationStuff() {
	  System.out.println("EnglishFortune: This is inside initialization method");
	  }
	  
	  
	  @PreDestroy
	  public void doDestructionStuff() {
	  System.out.println("EnglishFortune: This is inside destruction method"); 
	  }
	 

}