package org.ncu.GreetingMaven;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("engGreeting")
public class EnglishGreetingService implements GreetingService {

	// class variable or instance variable
	// Dependency of GreetingService App
	FortuneService fortune;

	// constructor injection
	@Autowired
	public EnglishGreetingService(@Qualifier("englishFortuneService") FortuneService fortune) {
		this.fortune = fortune;
	}

	public void greet(String name) {
		System.out.println("Hello, " + name);

	}

	@Override
	public void fortune(String name) {

		/* fortune = new EnglishFortuneService(); */
		fortune.tellFortune(name);
	}
}