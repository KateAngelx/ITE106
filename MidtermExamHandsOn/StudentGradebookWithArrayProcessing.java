import java.util.Scanner;

public class StudentGradebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();
        System.out.print("Enter the number of assignments: ");
        int numberOfAssignments = scanner.nextInt();

        String[] studentNames = new String[numberOfStudents];
        double[][] grades = new double[numberOfStudents][numberOfAssignments];
        double[] averageScores = new double[numberOfStudents];
        char[] letterGrades = new char[numberOfStudents];

        scanner.nextLine(); 

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Enter the name of student " + (i + 1) + ": ");
            studentNames[i] = scanner.nextLine();

            double totalScore = 0;
            for (int j = 0; j < numberOfAssignments; j++) {
                System.out.print("Enter score for assignment " + (j + 1) + ": ");
                grades[i][j] = scanner.nextDouble();
                totalScore += grades[i][j];
            }
            scanner.nextLine();

            averageScores[i] = totalScore / numberOfAssignments;
            letterGrades[i] = calculateLetterGrade(averageScores[i]);
        }

        System.out.println("\nStudent Gradebook:");
        System.out.printf("%-20s", "Name");
        for (int j = 0; j < numberOfAssignments; j++) {
            System.out.printf("Assignment %d  ", j + 1);
        }
        System.out.println("Average Score  Grade");

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.printf("%-20s", studentNames[i]);
            for (int j = 0; j < numberOfAssignments; j++) {
                System.out.printf("%14.2f", grades[i][j]);
            }
            System.out.printf("%14.2f    %c\n", averageScores[i], letterGrades[i]);
        }

        scanner.close();
    }

    public static char calculateLetterGrade(double averageScore) {
        if (averageScore >= 90) {
            return 'A';
        } else if (averageScore >= 80) {
            return 'B';
        } else if (averageScore >= 70) {
            return 'C';
        } else if (averageScore >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}