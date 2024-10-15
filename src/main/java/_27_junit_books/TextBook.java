package _27_junit_books;

public class TextBook extends Book {
	// Define a private int instance variable edition
	private int edition;

	// Define a constructor for TextBook that takes three parameters
	public TextBook(String title, double price, int edition) {
		super(title, price); // Call the superclass constructor
		this.edition = edition;
	}

	// Define a method called getBookInfo that overrides the superclass method
	@Override
	public String getBookInfo() {
		// Remove space before the edition hyphen
		return super.getBookInfo() + "-" + edition;
	}

	// Define a method called getEdition
	public int getEdition() {
		return edition;
	}

	// Define a method called canSubstituteFor
	public boolean canSubstituteFor(TextBook other) {
		return this.edition >= other.getEdition() && this.getTitle().equals(other.getTitle());
	}
}