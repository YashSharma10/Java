package GreetingApp;

import java.util.*;

public class Greeting {

	public static void main(String[] args) {

		System.out.println("Enter name: ");

		Scanner sc = new Scanner(System.in);

		String n = sc.nextLine();

		System.out.println("Enter language: ");

		String a = sc.nextLine();

		FactoryGreetingService factory = new FactoryGreetingService();

		GreetingService g = factory.getGreetingService("french");

		g.greet(n);

	}

}