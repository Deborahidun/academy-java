// This is the package declaration. It organizes classes into namespaces.
package _07_oop;

// Define a class named ChequingAccount that extends (inherits from) BankAccount.
class ChequingAccount extends BankAccount { 

    // Private property to hold the overdraft limit for the account.
    private double overDraftLimit;

    // Constructor for ChequingAccount. It initializes account number, initial balance, and overdraft limit.
    public ChequingAccount(String accountNumber, double initialBalance, double overDraftLimit) {
        // Call the constructor of the parent class (BankAccount) to set account number and balance.
        super(accountNumber, initialBalance);
        // Initialize the overdraft limit for this account.
        this.overDraftLimit = overDraftLimit;
    }
    
    // Method to withdraw an amount from the account.
    public void withdraw(double amount) {
        // Check if the withdrawal amount is positive and does not exceed the total available balance (including overdraft).
        if (amount > 0 && amount <= (getBalance() + overDraftLimit)) {
            // If the condition is met, call the withdraw method from the parent class (BankAccount).
            super.withdraw(amount);
        } 
        // If the conditions are not met, no action is taken (you might want to add a message or error handling here).
    }
}

