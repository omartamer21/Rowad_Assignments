import java.util.Scanner;

public class NumbOfStudents {
    public static void main(String[] args) {
        Scanner Omar=new Scanner(System.in);
        System.out.println("Enter number of students");
        int NumberOfStudents= Omar.nextInt();
        for(int i =0 ; i < NumberOfStudents ; i ++){
            System.out.println("Enter Student name: ");
            String Name = Omar.next();

            System.out.println("Enter 3 exam scores: ");
            Double score1= Omar.nextDouble();
            Double score2= Omar.nextDouble();
            Double score3= Omar.nextDouble();

            Double average = calculateAverage( score1 , score2 , score3 );
            String Grade = getgrade(average);

            System.out.println("Student Name: " + Name);
            System.out.println("Average Score: " + average );
            System.out.println("Grade: " + Grade);


        }



    }

    private static String getgrade(Double average) {
        if (average>=85)
            return "A";
        else if (average>=70)
            return "B";
        else if (average>=50)
            return "C";
        else
            return "F";
            }

    private static Double calculateAverage(Double score1, Double score2, Double score3) {
        return (score1 + score2 + score3) / 3;
    }
}
