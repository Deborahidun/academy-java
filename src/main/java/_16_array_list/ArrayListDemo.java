package _16_array_list;
import java.util.ArrayList;

//list declare abstract methods
		//CRUD - Create, Read, Update, Delete for every data structure
		


public class ArrayListDemo {

	public static void main(String[] args) {
	
	//Reserve storage for 10 items
	//restrict only string
		
	//Create	
	ArrayList<String> groceries = new ArrayList<>();	
	
	
	
	groceries.add("Milk");
	groceries.add("Bread");
	groceries.add("Eggs");
	
	
	//Read
	System.out.println("Grocery List: " + groceries);
	System.out.println(groceries.get(2));
	System.out.println(groceries.getFirst());
		
    //Update - set is used to update existing index
	groceries.set(1, "Coffee");
	
	
	
	//deletion
	groceries.remove(2);
	
	
	}

}
