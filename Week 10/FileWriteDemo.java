// This program demonstrates how to write data to a text file.
// It uses 'try-with-resources' to ensure the file is closed automatically.

// Import necessary I/O classes.
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;



public class FileWriteDemo {
public static void main(String[] args) {

// Define the file name we want to create.
String fileName = "transactions.txt";

// ============================================================
// TRY-WITH-RESOURCES
// ============================================================
// By placing the FileWriter and PrintWriter inside the try parentheses,
// Java guarantees they will be CLOSED automatically when the block finishes
// (even if an exception occurs). This prevents memory/resource leaks!
try (FileWriter fw = new FileWriter(fileName);
PrintWriter pw = new PrintWriter(fw)) {

System.out.println("Writing to file: " + fileName);

// Write lines of text to the file using println().
pw.println("TRX001, DEPOSIT, 5000, SUCCESS");
pw.println("TRX002, WITHDRAW, 2000, SUCCESS");
pw.println("TRX003, DEPOSIT, 15000, SUCCESS");
pw.println("TRX004, TRANSFER, 1000, FAILED");

// Check if an error occurred during writing.
if (pw.checkError()) {


System.out.println("An error occurred while writing.");
} else {
System.out.println("Data written successfully!");
}

} catch (IOException e) {
// Catch and handle any file-related errors (e.g., permission denied).
System.out.println("Error writing to file: " + e.getMessage());
}

// The file is now safely closed and saved in your 'week10' folder.
}
}