package org.ncu.GreetingMaven;

public interface FortuneService {
	public void tellFortune(String name);

	default String tellZodiac() {
		// take input from the user
		return "Scorpian";
	}

	default int tellNumber() {
		// take input from the user
		return 0;
	}
}