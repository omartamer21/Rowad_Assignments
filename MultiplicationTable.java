
import java.util.Scanner;

    public class MultiplicationTable {
        public static void main(String[] args) {
            Scanner Omar = new Scanner(System.in);

            System.out.print("Enter a number: ");
            int num = Omar.nextInt();

            System.out.println("Multiplication Table (1 to 10) for " + num + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(num + " x " + i + " = " + (num * i));
            }


        }
    }


