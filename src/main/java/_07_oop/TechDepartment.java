package _07_oop;

class TechDepartment extends Department {

	
	private double totalPurchaseAmount;
	
	public TechDepartment(String nameOfDepartment, int numberOfEmployees, double totalPurchaseAmount ) {
		super(nameOfDepartment, numberOfEmployees);
		this.totalPurchaseAmount = totalPurchaseAmount;
		
	}
}
