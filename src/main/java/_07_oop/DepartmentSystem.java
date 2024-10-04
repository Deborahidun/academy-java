package _07_oop;

public class DepartmentSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		SavingsAccount myAccount = new SavingsAccount("SAVINGS123" , 200.00, 1.00);
		myAccount.displayAccountInfo();
		myAccount.applyInterest();
	}

}
