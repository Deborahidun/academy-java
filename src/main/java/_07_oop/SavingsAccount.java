package _07_oop;  // Declares the package for organizing classes

// SavingsAccount class is extending BankAccount, inheriting its properties and methods.
// This demonstrates the concept of inheritance where SavingsAccount reuses code from BankAccount.
class SavingsAccount extends BankAccount {

    // Data Member: 'interestRate' is unique to SavingsAccount.
    // It represents the annual interest rate for the account (as a percentage).
    private double interestRate;

    // Constructor: Initializes a SavingsAccount object.
    // It takes the account number, initial balance, and interest rate as parameters.
    // The 'super' keyword is used to call the constructor of the superclass (BankAccount).
    public SavingsAccount(String accountNumber, double initialBalance, double interestRate) {
        
        // Calls the constructor of the parent class BankAccount with accountNumber and initialBalance.
        super(accountNumber, initialBalance);
        
        // Initializes the interestRate specific to SavingsAccount.
        this.interestRate = interestRate;
    }

    // Instance Method: 'applyInterest' calculates and applies the interest to the account balance.
    // It first calculates the interest amount by multiplying the current balance with the interest rate.
    // Then, it deposits the interest into the account using the deposit method from the parent class (BankAccount).
    public void applyInterest() {
        double interest = getBalance() * interestRate / 100;  // Calculates interest based on the balance and interest rate.
        deposit(interest);  // Adds the calculated interest to the balance by calling the deposit method.
    }
}
