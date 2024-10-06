package practice;

public class Car extends Vehicle {

	private int numberOfDoors;
	
	//constructor
	public Car(int year, String model, String make, int numberOfDoors) {
		super(year, model, make);
		this.numberOfDoors = numberOfDoors;
		}
	
	
	@Override
	public void displayVehicleDetails() {
		System.out.println("Vehicle: " + getYear() + " " + getMake() + " " + getModel());
		System.out.println("Number of doors: " + numberOfDoors);
		
		
	}
	
}
