package BankingApp.BankingAppAnnotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		 @SuppressWarnings("resource")
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AnnotationConfig.class);
		 SavingsAccount savingsAccount = context.getBean(SavingsAccount.class);
		 CurrentAccount currentAccount = context.getBean(CurrentAccount.class);
		 LoanAccount loanAccount = context.getBean(LoanAccount.class);
		 savingsAccount.Balance();
		 currentAccount.Balance();
		 loanAccount.Balance();
		 
	}

}
