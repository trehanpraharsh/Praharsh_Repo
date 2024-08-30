package assignment8;

public class SeedBank {
	
	public static void main(String[] args) {
		
		BankFund seedBankFund = new BankFund(9000000);
		
		LoanTransaction[] loanTransactions = new LoanTransaction[100];
		
		for(int index = 0; index<loanTransactions.length; index++) {
			loanTransactions[index] = new LoanTransaction(seedBankFund, (1000+index), 250000);
			
		}
		
		for(int index = 0; index<loanTransactions.length; index++) {
			loanTransactions[index].start();
			
		}
	}

}
