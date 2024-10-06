//OOP practice


package practice;

class Vehicle {
	
	//Attributes
	private String make;
	private String model;
	private int year;
	
	//constructor
	public Vehicle(int year, String model, String make) {
		this.year = year;
		this.model = model;
		this.make = make;}
	
	public int getYear() {
		return year;
	
	}
	
	public String getModel() {
		return model;
	}
	
	public String getMake() {
		return make;
	}
	
	
	
	public void displayVehicleDetails() {
		System.out.println("Vehicle: " + year + " " + make + " " + model);
	}

}
