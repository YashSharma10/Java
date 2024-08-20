package org.ncu.calculatorApp;

public class CalculatorFactory {
	public MathService getMathService(char o)
	{
		if(o=='+') {
			return (MathService) new AdditionService();
			
		}
		else if(o=='-') {
			return (MathService) new SubtractionService();
			
		}
		else if(o=='*') {
			return (MathService) new MultiplicationService();
			
		}
		else if(o=='/') {
			return (MathService) new DivisionService();
			
		}
		else
		{
			return null;
		}
		
	}

}