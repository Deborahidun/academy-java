package _15_generics;

public class GenericsDemo {

    // Generic method to print elements of an array
    public static <T> void printArray(T[] array) {
    	
        // Loop through each element in the array
        for (T element : array) {
        	
            // Print the current element
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        // Create an array of Integer type
    	
        Integer[] intArray = { 1, 2, 3 };
        
        // Create an array of String type
        String[] stringArray = { "Hello", "Hi", "Bye" };

        // Call the printArray method with Integer array
        printArray(intArray);
        
        // Call the printArray method with String array
        printArray(stringArray);
    }
}


//it helps with flexibility and type safety
