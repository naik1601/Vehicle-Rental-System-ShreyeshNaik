package Question2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Report {

    // Method to print the report to the console
    public static void printToConsole(Reportable reportable) {
        String report = reportable.generatereport();  
        System.out.println(report);                   
    }

    // Method to save the report to a CSV file 
    public static void persistToCSV(Reportable reportable, String fileName) {
        String report = reportable.generatereport();  // Get the report from the Reportable object
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(report);  
            System.out.println("Report saved to " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
