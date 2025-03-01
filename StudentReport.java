import java.util.Scanner;

public class StudentReport {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the number of subjects: ");
            int numSubjects = scanner.nextInt();
            int totalMarks = 0;
            
            // Taking marks input
            for (int i = 1; i <= numSubjects; i++) {
                System.out.print("Enter marks for subject " + i + " (out of 100): ");
                int marks = scanner.nextInt();
                
                // Ensure valid marks
                while (marks < 0 || marks > 100) {
                    System.out.print("Invalid input! Enter marks between 0 and 100: ");
                    marks = scanner.nextInt();
                }
                
                totalMarks += marks;
            }
            
            // Calculate average percentage
            double averagePercentage = (double) totalMarks / numSubjects;
            
            // Determine grade
            char grade;
            if (averagePercentage >= 90) {
                grade = 'A';
            } else if (averagePercentage >= 80) {
                grade = 'B';
            } else if (averagePercentage >= 70) {
                grade = 'C';
            } else if (averagePercentage >= 60) {
                grade = 'D';
            } else {
                grade = 'F';
            }
            
            // Display results
            System.out.println("\n--- Student Report ---");
            System.out.println("Total Marks: " + totalMarks);
            System.out.println("Average Percentage: " + averagePercentage + "%");
            System.out.println("Grade: " + grade);
        }
    }
}
