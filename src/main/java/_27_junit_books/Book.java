package _27_junit_books;

public class Book {
	// Define two private instance variables: title and price
	private String title;
	private double price;

	// Define a constructor that takes two parameters: title and price
	public Book(String title, double price) {
		this.title = title;
		this.price = price;
	}

	// Define a getter method named getTitle
	public String getTitle() {
		return title;
	}

	// Define a method named getBookInfo
	public String getBookInfo() {
		// Remove spaces around the hyphen
		return title + "-" + price;
	}
}
