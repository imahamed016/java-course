
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DataProcessor {
    public static void main(String[] args) {

        // Store student names and their results
        Map<String, String> results = new HashMap<>();

        String inputFile = "students.csv";
        String outputFile = "report.txt";

        double totalMarks = 0;
        int studentCount = 0;

        // STEP 1: READ AND PROCESS THE CSV
        try {
            File file = new File(inputFile);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                String[] parts = line.split(",");

                if (parts.length == 3) {
                    String id = parts[0];
                    String name = parts[1];
                    int marks = Integer.parseInt(parts[2]);

                    totalMarks += marks;
                    studentCount++;

                    if (marks >= 50) {
                        results.put(name, "PASSED");
                    } else {
                        results.put(name, "FAILED");
                    }
                }
            }

            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("Error: Input file not found.");
            return;
        } catch (NumberFormatException e) {
            System.out.println("Error: The file contains non-numeric marks.");
            return;
        }

        // STEP 2: WRITE THE REPORT
        try (PrintWriter writer = new PrintWriter(
                new FileWriter(outputFile))) {

            writer.println("=== EXAMINATION REPORT ===");
            writer.println("Total Students Processed: " + studentCount);

            if (studentCount > 0) {
                writer.println("Class Average: "
                        + (totalMarks / studentCount));
            } else {
                writer.println("Class Average: N/A");
            }

            writer.println("--------------------------");

            for (Map.Entry<String, String> entry : results.entrySet()) {
                writer.println("Student: " + entry.getKey()
                        + " | Result: " + entry.getValue());
            }

            System.out.println(
                    "Data processing complete! Check "
                    + outputFile + " for results.");

        } catch (IOException e) {
            System.out.println(
                    "Error writing report file: " + e.getMessage());
        }
    }
}
