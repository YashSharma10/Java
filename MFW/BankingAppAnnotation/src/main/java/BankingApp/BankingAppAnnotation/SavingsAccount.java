package BankingApp.BankingAppAnnotation;

import org.springframework.stereotype.Component;

@Component
public class SavingsAccount implements Account{
	public static void main(String args[]) {
		
	}
	

	@Override
	public void Balance() {
		System.out.println("Savings Balance");
		
	}
}
