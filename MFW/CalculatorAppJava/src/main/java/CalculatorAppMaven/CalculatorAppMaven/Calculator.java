package CalculatorAppMaven.CalculatorAppMaven;

public class Calculator {
	MathService additionService;
	MathService subtractionService;
	MathService multiplicationService;
	MathService divisionService;

	public Calculator(MathService additionService, MathService subtractionService, MathService multiplicationService,
			MathService divisionService) {
		this.additionService = additionService;
		this.subtractionService = subtractionService;
		this.multiplicationService = multiplicationService;
		this.divisionService = divisionService;
	}

	public void compute(String operation, int x, int y) {
		switch (operation) {
		case "add":
			additionService.operate(x, y);
			break;
		case "subtract":
			subtractionService.operate(x, y);
			break;
		case "multiply":
			multiplicationService.operate(x, y);
			break;
		case "divide":
			divisionService.operate(x, y);
			break;
		default:
			throw new IllegalArgumentException("Invalid operation: " + operation);
		}
	}
}