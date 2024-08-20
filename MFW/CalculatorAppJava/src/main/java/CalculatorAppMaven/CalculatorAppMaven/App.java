package CalculatorAppMaven.CalculatorAppMaven;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
 public static void main(String[] args) {
     ApplicationContext context = new AnnotationConfigApplicationContext(AnnotationConfig.class);

     Calculator calculator = context.getBean(Calculator.class);
     calculator.compute("add", 10, 5);
     calculator.compute("subtract", 12, 3);
     calculator.compute("multiply", 4, 5);
     calculator.compute("divide",60, 2);
 }
}
