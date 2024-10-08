package _16_array_list;

import java.util.ArrayList;

public class ArrayListPractice {

	public static void main(String[] args) {
		
		
        // Create and initialize an ArrayList to hold city names
        ArrayList<String> cities = new ArrayList<>();
        
        // 1. Adding city names to the ArrayList
        cities.add("Toronto");
        cities.add("Vancouver");
        cities.add("Montreal");
        cities.add("Calgary");
        cities.add("Ottawa");
        
        // 2. Fetching and printing city names
        System.out.println("Cities in the list:");
        for (String city : cities) {
            System.out.println(city);
        }
        
        // 3. Accessing specific city names using their index
        cities.get(0); // Fetch the first city
        cities.get(cities.size() - 1); // Fetch the last city
        System.out.println("\nFirst city: " + cities.getFirst());
        System.out.println("Last city: " + cities.getLast());
        
        // 4. Updating a city name
        System.out.println("\nUpdating the city at index 3 (Calgary to Edmonton)");
        cities.set(3, "Edmonton"); // Update the city at index 3
        System.out.println("Updated cities: " + cities);
        
        // 5. Removing a city name
        System.out.println("\nRemoving the city at index 1 (Vancouver)");
        cities.remove(1); // Remove the city at index 1
        System.out.println("Cities after removal: " + cities);
        
        // 6. Checking if a city exists in the list
        String checkCity = "Montreal";
        if (cities.contains(checkCity)) {
            System.out.println("\n" + checkCity + " is in the list.");
        } else {
            System.out.println("\n" + checkCity + " is not in the list.");
        }
        
        // 7. Printing the total number of cities
        System.out.println("Total number of cities in the list: " + cities.size());
    }


	}


