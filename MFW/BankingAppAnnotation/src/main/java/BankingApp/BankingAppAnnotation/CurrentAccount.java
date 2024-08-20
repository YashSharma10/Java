package BankingApp.BankingAppAnnotation;

import org.springframework.stereotype.Component;

@Component
public class CurrentAccount implements Account{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	@Override
	public void Balance() {
		System.out.println("Current Balance");
		
	}


}
