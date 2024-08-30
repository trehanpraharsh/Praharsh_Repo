package assignment7;

public class WithdrawTransaction extends Security implements Runnable {
	
	private int transactionID;
	private Account account;
	private Customer customer;
	private double amount;
	
	public WithdrawTransaction(int transactionID, Account account, Customer customer, double amount) {
		super();
		this.transactionID = transactionID;
		this.account = account;
		this.customer = customer;
		this.amount = amount;
	}

	public synchronized double withdraw(Account account, double amount) throws InsufficientBalanceException {
		
		if(account.getBalance() >= amount) {
			account.setBalance(account.getBalance() - amount);
		} else {
			throw new InsufficientBalanceException();
		}
		
		return account.getBalance();
		
	}


	@Override
	public void run() {
		
		try {
			authorization(account, customer);
			double balance = withdraw(account, amount);
			System.out.println("transactionID " + transactionID + " completed!!! and the balance amount is " + balance);
			
		} catch(UnAuthorizedWithdrawTransactionException unAuthorizedWithdrawTransactionException) {
			System.out.println("transactionId " + transactionID + " failed!!! and " + unAuthorizedWithdrawTransactionException.getMessage());
			
		} catch(InsufficientBalanceException insufficientBalanceException) {
			System.out.println("transactionId " + transactionID + " failed!!! and " + insufficientBalanceException.getMessage());
		}
		
	}

	
	
}
