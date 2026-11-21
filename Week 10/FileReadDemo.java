// This program demonstrates how to read data from a file line-by-line.
// It uses Scanner to read the file and handles missing file errors.

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadDemo {
public static void main(String[] args) {

// We will read the file we created in Task 2.
String fileName = "transactions.txt";

// ============================================================
// READING THE FILE
// ============================================================
try {
// Create a File object pointing to the file.
File file = new File(fileName);

// Create a Scanner to read from the File object (not System.in).
Scanner fileScanner = new Scanner(file);

System.out.println("=== READING FILE: " + fileName + " ===");


// Loop until there are no more lines to read.
while (fileScanner.hasNextLine()) {
// Read the next line and store it in a String.
String line = fileScanner.nextLine();

// Print the line to the console.
System.out.println(line);
}

// Close the scanner to free resources.
fileScanner.close();
System.out.println("=== FILE READING COMPLETE ===");

} catch (FileNotFoundException e) {
// If the file doesn't exist (e.g., you deleted it or misspelled the name),
// this catch block prevents the program from crashing.
System.out.println("Error: The file '" + fileName + "' was not found.");
}
}
}