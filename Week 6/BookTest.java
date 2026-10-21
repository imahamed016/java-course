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