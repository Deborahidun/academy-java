package practice;

public class Main {

	public static void main(String[] args) {
		
		Car car = new Car(2022, "Toyota", "Camry", 4);
		car.displayVehicleDetails();
		
		System.out.println();
		
		Truck truck = new Truck(2018, "Ford", "F-150", 1000);
		truck.displayVehicleDetails();
		
		
	}

}
