package _07_oopdemo;  // Package declaration for organizing related classes

class Product {
    
    // Private fields to store product details
	private String productId;      // Unique identifier for the product
	private String productName;    // Name of the product
	private double productPrice;    // Price of the product
	private int productQuantity;    // Quantity of the product in stock
	
    // Constructor to initialize a new Product object with provided values
	public Product(String productId, String productName, double productPrice, int productQuantity){
		this.productId =  productId;         // Assigns the provided productId to the class field
		this.productName =  productName;     // Assigns the provided productName to the class field
		this.productPrice =  productPrice;   // Assigns the provided productPrice to the class field
		this.productQuantity =  productQuantity; // Assigns the provided productQuantity to the class field
	}
	
	// Getters/Accessors - these methods return the values of private fields
	public String getProductId() {
		return this.productId;  // Returns the productId of the product
	}
	
	public String getProductName() {
		return this.productName; // Returns the productName of the product
	}
	
	public double getProductPrice() {
		return this.productPrice; // Returns the productPrice of the product
	}
	
	public int getProductQuantity() {
		return this.productQuantity; // Returns the productQuantity of the product
	}
	//Mutator
	// Method to reduce the stock of the product by a specified quantity
	public void reduceStock(int quantity) {
		// Check if the requested quantity to reduce is less than or equal to the available stock
		if(quantity <= productQuantity) {
			this.productQuantity -= quantity;  // Decrease the productQuantity by the requested amount
		} else {
			// Throw an IllegalArgumentException if there is insufficient stock to fulfill the request
			throw new IllegalArgumentException("Insufficient Stock!");
		}
	}
}