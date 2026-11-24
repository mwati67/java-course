public class BookTest {
public static void main(String[] args) {
// Create a new Book object
Book myBook = new Book("Java Programming", "John Doe", 1500.00);

// Display initial info
myBook.displayBookInfo();

// Test valid and invalid setters
System.out.println("Attempting to change price to -500...");
myBook.setPrice(-500); // Should trigger error

System.out.println("\nBorrowing the book...");
myBook.borrowBook();
myBook.displayBookInfo();

System.out.println("Returning the book...");
myBook.returnBook();
myBook.displayBookInfo();
}
}

class Book {
	private final String title;
	private final String author;
	private double price;
	private boolean borrowed;

	public Book(String title, String author, double price) {
		this.title = title;
		this.author = author;
		if (price < 0) {
			System.out.println("Price cannot be negative.");
		} else {
			this.price = price;
		}
	}

	public void displayBookInfo() {
		System.out.println("Title: " + title);
		System.out.println("Author: " + author);
		System.out.println("Price: " + price);
		System.out.println("Status: " + (borrowed ? "Borrowed" : "Available"));
	}

	public void setPrice(double price) {
		if (price < 0) {
			System.out.println("Price cannot be negative.");
			return;
		}
		this.price = price;
	}

	public void borrowBook() {
		if (borrowed) {
			System.out.println("Book is already borrowed.");
		} else {
			borrowed = true;
		}
	}

	public void returnBook() {
		if (!borrowed) {
			System.out.println("Book is not currently borrowed.");
		} else {
			borrowed = false;
		}
	}
}
