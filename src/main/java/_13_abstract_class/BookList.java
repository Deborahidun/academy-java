package _13_abstract_class;

import java.util.ArrayList;

public class BookList {

	public static void main(String[] args) {
		
		int counter = 1;
		//Create	
		ArrayList<String> myBooks = new ArrayList<>();	
		
		//Add
		myBooks.add("Harry potter");
		myBooks.add("Chronicles of narnia");
		myBooks.add("Lord of the rings");
		
//rEAD
		
		System.out.println("My favorite books are: " + myBooks);
		
		
		//Another way to read
		for (String book : myBooks) {
			System.out.println("Book " + counter + ":" + book);	
			counter++;
			
	//display first book
			System.out.println(myBooks.getFirst());	
			System.out.println(myBooks.get(0));	
			
			
		//delete the 2nd books	
			myBooks.remove(1);
			
			
			
			//search for a book - we use a method called contains which returns a boolean
			if(myBooks.contains("Harry potter")) {
				System.out.println("Book found");
			}else{
				System.out.println("Book not found");	
			}
		}
		//last
		System.out.println("The size of the list is: " + myBooks.size());
		System.out.println("The last item of the list is" + myBooks.get(myBooks.size()-1));
	}

}
