package _06_switch;

import java.util.Scanner;

//Used to check absolute values
//Mostly with menu driven programs

public class Switch {
	
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        int choice;
        double totalPrice = 0.0;
        String plan = "";

        System.out.println("Welcome to the Mobile Data Plan Selector!");
        System.out.println("Please select a data plan:");
        System.out.println("1. 1 GB - $10");
        System.out.println("2. 5 GB - $30");
        System.out.println("3. 10 GB - $50");
        System.out.println("4. Unlimited - $70");
        System.out.println("5. Exit");

        System.out.print("Enter the number corresponding to your choice: ");
        choice = scanner.nextInt();

        switch (choice) {
            case 1:
                plan = "1 GB";
                totalPrice = 10.00;
                break;
            case 2:
                plan = "5 GB";
                totalPrice = 30.00;
                break;
            case 3:
                plan = "10 GB";
                totalPrice = 50.00;
                break;
            case 4:
                plan = "Unlimited";
                totalPrice = 70.00;
                break;
            case 5:
                System.out.println("Exiting the program. Thank you!");
                break;
            default:
                System.out.println("Invalid choice. Please select a valid option.");
        }

        // Display selected plan and total cost, only if the user did not choose to exit
        if (choice >= 1 && choice <= 4) {
            System.out.println("You have selected the " + plan + " plan.");
            System.out.println("The total cost of your selected plan is: $" + totalPrice);
        }

        scanner.close();
    }
}

//class exercise
