package org.ncu.calculatorApp;

import java.util.*;
public class MainApp {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter two operands ");
		float x=sc.nextInt();
		float y=sc.nextInt();
		CalculatorFactory a= new CalculatorFactory();
		System.out.println("Enter + for additon - for subtraction * for multiplication / for divison");
		char o= sc.next().charAt(0);
		MathService b= a.getMathService(o);
		double c =b.operate(x, y);
		System.out.println(c);
		sc.close();
		
	}
	

}
