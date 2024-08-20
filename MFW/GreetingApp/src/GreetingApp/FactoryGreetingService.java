package GreetingApp;

public class FactoryGreetingService {

	public GreetingService getGreetingService(String lang) {

		if (lang == "english") {

			return (GreetingService) new EnglishGreetingService();

		}

		else if (lang == "french") {

			return (GreetingService) new FrenchGreetingService();

		}

		else

		{

			return null;

		}

	}

}