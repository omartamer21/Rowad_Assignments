import java.util.Scanner;

public class ArrayAssi {
    public static void main(String[] args) {

        Scanner Omar = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int NumberOfStudents = Omar.nextInt();
        int[] marks = new int[NumberOfStudents];
        int sum = 0;
        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;
        int passed = 0;
        int failed = 0;

         for (int i = 0; i < NumberOfStudents; i++) {
             System.out.print("Enter mark for student " + (i + 1) + ": ");
             marks[i] = Omar.nextInt();
             sum += marks[i];

             if (marks[i] > highest) {
                 highest = marks[i];
             }
             if (marks[i] < lowest) {
                 lowest = marks[i];
             }

             if (marks[i] >= 50) {
                 passed++;
             } else {
                 failed++;
             }
         }

                double average = (double) sum / NumberOfStudents;

                System.out.println("\nResults:");
                System.out.println("Average mark: " + average);
                System.out.println("Highest mark: " + highest);
                System.out.println("Lowest mark: " + lowest);

                System.out.println("\nAll student marks:");
                for (int i = 0; i < NumberOfStudents; i++) {
                    System.out.println("Student " + (i + 1) + ": " + marks[i]);
                }

                System.out.println("\nNumber of students passed: " + passed);
                System.out.println("Number of students failed: " + failed);


            }
        }








