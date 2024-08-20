package BankingApp.BankingAppAnnotation;

import org.springframework.stereotype.Component;


@Component
public class LoanAccount implements Account{

	public static void main(String[] args) {
		

	}
	@Override
	public void Balance() {
		System.out.println("Loan Balance");
		
	}


}
