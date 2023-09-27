package studentMarklist;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Marklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> studentDataList = new ArrayList<>();

        System.out.println("================================================================================");
        System.out.println("                         STUDENT MARKLIST");
        System.out.println("================================================================================");
        System.out.println("Roll  | Name         | Mark1 | Mark2 | Mark3 | Total | Result | Average | Grade");

        while (true) {
            // Prompt the user for input
            System.out.print("Enter your roll number (0 to exit): ");
            int rollNumber = scanner.nextInt();

            // Exit the loop if the user enters 0
            if (rollNumber == 0) {
                break;
            }

            scanner.nextLine(); // Consume the newline character

            System.out.print("Enter your name: ");
            String name = scanner.nextLine();

            System.out.print("Enter mark1: ");
            double mark1 = scanner.nextDouble();

            System.out.print("Enter mark2: ");
            double mark2 = scanner.nextDouble();

            System.out.print("Enter mark3: ");
            double mark3 = scanner.nextDouble();

            // Calculate the total mark and average mark
            double total = mark1 + mark2 + mark3;
            double average = total / 3;

            // Determine the result (Pass/Fail)
            String result = (average >= 40) ? "P" : "F";

            // Determine the grade based on the grading criteria
            char grade;
            if (average >= 80) {
                grade = 'A';
            } else if (average >= 75) {
                grade = 'B';
            } else if (average >= 65) {
                grade = 'C';
            } else if (average >= 55) {
                grade = 'D';
            } else {
                grade = 'F';
            }

            // Add student data to the list
            String studentData = String.format("%-6d| %-13s| %-6.1f| %-6.1f| %-6.1f| %-6.1f| %-6s | %-8.1f| %-6c",
                    rollNumber, name, mark1, mark2, mark3, total, result, average, grade);
            
            studentDataList.add(studentData);

            // Display the table including all student data
            System.out.println("================================================================================");
            System.out.println("                         STUDENT MARKLIST");
            System.out.println("================================================================================");
            System.out.println("Roll  | Name         | Mark1 | Mark2 | Mark3 | Total | Result | Average | Grade");
            
            for (String data : studentDataList) {
                System.out.println(data);
            }
        }

        // Close the scanner
        scanner.close();
    }
}



 
	


