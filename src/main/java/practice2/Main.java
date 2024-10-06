package practice2;

public class Main {

	public static void main(String[] args) {
		try {
			// Create a bank account with an initial balance of 1000
			BankAccount myBankAccount = new BankAccount(1000);
			
			// Deposit some money
			myBankAccount.deposit(10);
			System.out.println("After deposit, your current balance is: $" + myBankAccount.getBalance());
			
			// Withdraw some money
			myBankAccount.withdraw(4);
			System.out.println("After withdrawal, your current balance is: $" + myBankAccount.getBalance());
			
		} catch (InsufficientFundsException e) {
			System.out.println(e.getMessage());
			
		} catch (InvalidDepositException e) {
			System.out.println(e.getMessage());
		}
	}
}

