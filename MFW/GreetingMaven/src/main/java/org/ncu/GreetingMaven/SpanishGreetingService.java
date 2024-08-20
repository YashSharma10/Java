package org.ncu.GreetingMaven;



import org.springframework.stereotype.Component;

@Component
public class SpanishGreetingService implements GreetingService{
	public void greet(String name) {
		System.out.println("Hola, "+name);
	}

	@Override
	public void fortune(String name) {
		// TODO Auto-generated method stub
		
	}
}