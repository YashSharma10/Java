package org.ncu.GreetingMaven;



import org.springframework.stereotype.Component;

@Component
public class EnglishFortuneService implements FortuneService {
	String[] fortunes = {
			"A dubious friend may be an enemy in camouflage.", 
		    "Your success will astonish everyone.", 
		    "You will soon be surrounded by good friends and laughter.", 
		    "Many will travel to hear you speak.",
		    "Now is a good time to buy stock.",
		    "Physical activity will dramatically improve your outlook today.",
		    "Say hello to others. You will have a happier day.",
		    "You should be able to undertake and complete anything.",
		    "You will be pleasantly surprised today.",
		    "You will be traveling and coming into a fortune."
	};
	
	/*
	 * public int getNumber() { // take the number as input from the user return 0;
	 * }
	 * 
	 * public String getZodiac() { // take the zodiac as input from the user return
	 * "Scorpian"; }
	 */
	
	@Override
	public void tellFortune(String name) {
		int x = tellNumber();
		String z = tellZodiac();
		int y = z.length();
		
		int res = (x+y)%fortunes.length;
		
		System.out.println(name+", your fortune is: "+fortunes[res]);
		
	}

}