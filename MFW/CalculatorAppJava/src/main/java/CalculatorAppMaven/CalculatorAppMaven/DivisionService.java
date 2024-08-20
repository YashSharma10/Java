package CalculatorAppMaven.CalculatorAppMaven;

import org.springframework.stereotype.Component;
@Component
public class DivisionService implements MathService {

	public static void main(String[] args) {	
	}

	@Override
	public void operate(int x, int y) {
		System.out.println("Div = "+ (x/y));
	}

}
