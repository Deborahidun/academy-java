package practice2;

class BankAccount {
	
	private double balance;
	
	// Constructor
	public BankAccount(double balance) {
		this.balance = balance;
	}
		
	// Withdraw
	public double withdraw(double amount) throws InsufficientFundsException {
		if(balance < amount) {
			throw new InsufficientFundsException("Error: Insufficient funds. You only have $" + balance + " in your account.");
		} else {
			balance -= amount;  // Deduct the amount from balance
			return balance;
		}
	}
		
	// Deposit
	public double deposit(double amount) throws InvalidDepositException {
		if(amount < 0) {
			throw new InvalidDepositException("Error: Cannot deposit a negative amount."); 
		} else {
			balance += amount;  // Add the amount to balance
			return balance;
		}
	}
	
	// Method to get current balance
	public double getBalance() {
		return balance;
	}
}

