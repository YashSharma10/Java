package CalculatorAppMaven.CalculatorAppMaven;

import org.springframework.stereotype.Component;
@Component
public class SubtractionService implements MathService {

	public static void main(String[] args) {
		
		
	}

	@Override
	public void operate(int x, int y) {
		System.out.println("Diff = "+ (x-y));
	}

}
