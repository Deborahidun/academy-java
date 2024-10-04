package _07_oop;  // Declares the package for organizing classes

class BankAccount {

    // Data Members / Properties: These are the attributes of the BankAccount class.
    // 'accountNumber' stores the account number of the bank account as a String.
    // 'balance' stores the current balance of the bank account as a double.
    private String accountNumber;
    private double balance;

    // Constructor: This is a special method used to initialize objects.
    // It is public and has the same name as the class.
    // The constructor initializes the 'accountNumber' and 'balance' when a new BankAccount object is created.
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;  // 'this' refers to the current object's accountNumber.
        this.balance = initialBalance;  // 'this' refers to the current object's balance.
    }

    // Instance Method: 'deposit' method allows the user to deposit money into the account.
    // It takes the amount to deposit as a parameter and adds it to the balance, only if the amount is positive.
    public void deposit(double amount) {
        if (amount > 0) {  // Ensures only positive amounts can be deposited.
            balance += amount;  // Adds the deposit amount to the balance.
        }
    }

    // Instance Method: 'withdraw' method allows the user to withdraw money from the account.
    // It takes the amount to withdraw as a parameter and subtracts it from the balance, only if the amount is positive and less than or equal to the current balance.
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {  // Checks if the amount is valid and there are sufficient funds.
            balance -= amount;  // Deducts the withdrawal amount from the balance.
        }
    }

    // Getter Method: 'getBalance' allows the user to retrieve the current balance.
    // It provides access to the balance without allowing direct modification of the 'balance' property (encapsulation).
    public double getBalance() {
        return balance;  // Returns the current balance of the account.
    }

    // Instance Method: 'displayAccountInfo' prints the account number and current balance to the console.
    // This method can be used to view basic information about the account.
    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);  // Displays the account number.
        System.out.println("Current Balance: " + balance);  // Displays the current balance.
    }
}
