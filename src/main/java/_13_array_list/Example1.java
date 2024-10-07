package _13_array_list;
import java.util.ArrayList;



public class Example1 {

	
	 public static void main(String[] args) {
	        // Step 1: Create an ArrayList to store String elements
	        ArrayList<String> fruits = new ArrayList<>();

	        // Step 2: Add elements to the ArrayList
	        fruits.add("Apple");
	        fruits.add("Banana");
	        fruits.add("Orange");
	        
	        // Step 3: Access elements using the get() method
	        System.out.println("First fruit: " + fruits.get(0)); // Output: Apple
	        
	        // Step 4: Modify an element
	        fruits.set(1, "Grapes"); // Replace "Banana" with "Grapes"
	        System.out.println("Updated fruit at index 1: " + fruits.get(1)); // Output: Grapes

	        // Step 5: Remove an element
	        fruits.remove(2); // Removes "Orange"
	        
	        // Step 6: Display the ArrayList contents
	        System.out.println("Fruits List: " + fruits); // Output: [Apple, Grapes]
	        
	        // Step 7: Check the size of the ArrayList
	        System.out.println("Size of the ArrayList: " + fruits.size()); // Output: 2
	    }
	}

