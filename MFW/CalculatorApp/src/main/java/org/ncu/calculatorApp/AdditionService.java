package org.ncu.calculatorApp;

public class AdditionService implements MathService{

	double sum;
	public double operate(float x, float y) {
		// TODO Auto-generated method stub
		 sum=x+y;
		return sum;
		
	}
}
