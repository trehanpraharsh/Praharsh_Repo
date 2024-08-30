package assignment8;

public class LoanTransaction {
	
	private BankFund bankFund;
	private int customerID;
	private double loanAmount;
	
	public LoanTransaction(BankFund bankFund, int customerID, double loanAmount) {
		this.bankFund = bankFund;
		this.customerID = customerID;
		this.loanAmount = loanAmount;
	}
	
	public void start() {
		try {
			bankFund.checkFund(loanAmount);
			Thread.sleep((long) (2000*Math.random()));
			
			double fundAvailable = bankFund.debitFund(loanAmount);
			System.out.println(customerID + "The loan is disbursed. Please collect the cash from the Teller");
			System.out.println("Fund left in the bank " + fundAvailable);
			
		} catch(InsufficientFundException insufficientFundException) {
			System.out.println("Sorry!!! " + customerID + " Please try some days later as we are short of funds");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	

}
