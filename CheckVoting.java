import java.util.Scanner;

public class CheckVoting {
    public static void main(String[] args)
    {
        Scanner Omar = new Scanner(System.in);
        System.out.println("Enter Your Age");
        int age = Omar.nextInt();
        System.out.println("Enter Your Nationality");
        String nati = Omar.next();
        if (age >= 18 && nati.equalsIgnoreCase("Egyptian") )
            System.out.println("You are eligble to vote");
        else {
            System.out.println("Not eligible");
        }






    }
}