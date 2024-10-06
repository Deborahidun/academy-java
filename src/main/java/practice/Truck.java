package practice;

public class Truck extends Vehicle {

	//Attribute
	private int payloadCapacity;
	
	//constructor
	public Truck(int year, String model, String make, int payloadCapacity) {
		super(year, model, make);
		this.payloadCapacity = payloadCapacity;
	}
	
	@Override
	public void displayVehicleDetails() {
		System.out.println("Vehicle: " + getYear() + " " + getMake() + " " + getModel());
		System.out.println("Payload capacity: " + payloadCapacity + "kg");
}
}