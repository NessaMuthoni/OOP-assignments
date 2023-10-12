package marksheet2;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class marksheet2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> studentDataList = new ArrayList<>();
        
        int numStudents = 4;
        int numMarks = 3;

        // Create arrays to store student data
        int[] rollNumbers = new int[numStudents];
        String[] names = new String[numStudents];
        double[][] marks = new double[numStudents][numMarks];
        double[] totals = new double[numStudents];
        String[] results = new String[numStudents];
        double[] averages = new double[numStudents];
        char[] grades = new char[numStudents];

        
     

        for (int i = 0; i < numStudents; i++) {
            // Prompt user for roll number
            System.out.print("Enter the Students roll number: ");
            rollNumbers[i] = scanner.nextInt();

            if (rollNumbers[i] == 0) {
                break;
            }

            scanner.nextLine();

            // Prompt user for name
            System.out.print("Enter the Student name: ");
            names[i] = scanner.nextLine();

            // Prompt user for marks
            for (int j = 0; j < numMarks; j++) {
                System.out.print("Enter mark" + (j + 1) + ": ");
                marks[i][j] = scanner.nextDouble();
            }

            
            totals[i] = marks[i][0] + marks[i][1] + marks[i][2];
            averages[i] = totals[i] / numMarks;
            results[i] = (marks[i][0] > 50 && marks[i][1] > 50 && marks[i][2] > 50) ? "P" : "F";



            if (averages[i] >= 80) {
                grades[i] = 'A';
            } else if (averages[i] >= 75) {
                grades[i] = 'B';
            } else if (averages[i] >= 65) {
                grades[i] = 'C';
            } else if (averages[i] >= 55) {
                grades[i] = 'D';
            } else {
                grades[i] = 'F';
            }
       String studentData =String.format("%-6d| %-13s| %-6.1f| %-6.1f| %-6.1f| %-6.1f| %-6s | %-8.1f| %-6c%n",
                    rollNumbers[i], names[i], marks[i][0], marks[i][1], marks[i][2], totals[i], results[i], averages[i], grades[i]);
       
       studentDataList.add(studentData);
           
            System.out.println("The Total is " + totals[i]);
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




