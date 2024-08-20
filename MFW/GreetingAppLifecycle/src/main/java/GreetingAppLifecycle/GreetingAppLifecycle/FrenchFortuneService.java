package GreetingAppLifecycle.GreetingAppLifecycle;

import org.springframework.stereotype.Component;

@Component
public class FrenchFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "Aujourd'hui est ton jour de chance!";
	}

}