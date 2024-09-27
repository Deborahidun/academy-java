package com.bptn.course;

import java.util.Scanner;

public class _06_Switch {

	public static void main(String[] args) {
		
		    	 Scanner scanner = new Scanner(System.in);

		         // Product prices
		         double cokePrice = 1.50;
		         double iceteaPrice = 2.00;
		         double lemonadePrice = 0.75;

		         // Display the products
		         System.out.println("Welcome to the Vending Machine!");
		         System.out.println("1. Coke - $1.50");
		         System.out.println("2. Ice Tea - $2.00");
		         System.out.println("3. Lemonade - $0.75");

		         // Ask the user to choose a product
		         System.out.print("Choose a product (1-3): ");
		         int choice = scanner.nextInt();

		         double price = 0;

		         // Switch statement to select product
		         switch (choice) {
		             case 1: // Coke
		                 price = cokePrice;
		                 System.out.println("You chose Coke. Price: $" + price);
		                 break;
		             case 2: // Ice Tea
		                 price = iceteaPrice;
		                 System.out.println("You chose Ice Tea. Price: $" + price);
		                 break;
		             case 3: // Lemonade
		                 price = lemonadePrice;
		                 System.out.println("You chose Lemonade. Price: $" + price);
		                 break;
		             default:
		                 System.out.println("Invalid choice.");
		                 scanner.close();
		                 
		         }

		         // Ask for payment
		         System.out.print("Enter your payment: $");
		         double payment = scanner.nextDouble();

		         // Check if payment is enough
		         if (payment >= price) {
		             System.out.println("Product dispensed.");
		             System.out.println("Your change is: $" + (payment - price));
		         } else {
		             System.out.println("Not enough money. Transaction cancelled.");
		         }

		         scanner.close();
		     }

	}


