package org.ncu.GreetingMaven;



import org.springframework.stereotype.Component;

@Component
public class FactoryFortuneService {
	public FortuneService fortuneService(String lang) {
		if(lang.equals("eng")) {
			return new EnglishFortuneService();
		}else {
			throw new RuntimeException("Sorry, "+lang+" is not available!");
		}
	}
}