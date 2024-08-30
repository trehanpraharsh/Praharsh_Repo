package assignment7;

public class DepositTransaction extends Thread {

	private int transactionID;
	
	private Account account;
	
	private double amount;
	
	private int customerID;

	public DepositTransaction(int transactionID, Account account, double amount, int customerID) {
		super();
		this.transactionID = transactionID;
		this.account = account;
		this.amount = amount;
		this.customerID = customerID;
	}
	
	public void deposit(Account account, double amount) {
		account.setBalance(account.getBalance() + amount);
	}
	
	public void run() {
		
		deposit(account, amount);
		System.out.println("transactionId" + transactionID + " completed!!" + customerID + " thank you for depositing to the Account " + account.getAccountNo() );
		
		
	}
	
}
