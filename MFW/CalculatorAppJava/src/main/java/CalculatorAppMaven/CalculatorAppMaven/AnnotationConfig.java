package CalculatorAppMaven.CalculatorAppMaven;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class AnnotationConfig {

	 @Bean
	 public MathService additionService() {
	     return new AdditionService();
	 }

	 @Bean
	 public MathService subtractionService() {
	     return new SubtractionService();
	 }

	 @Bean
	 public MathService multiplicationService() {
	     return new MultiplicationService();
	 }

	 @Bean
	 public MathService divisionService() {
	     return new DivisionService();
	 }

	 @Bean
	 public Calculator calculator(
	         MathService additionService,
	         MathService subtractionService,
	         MathService multiplicationService,
	         MathService divisionService) {
	     return new Calculator(additionService, subtractionService, multiplicationService, divisionService);
	 }

}
