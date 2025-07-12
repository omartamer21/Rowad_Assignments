import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner Omar = new Scanner(System.in);
        String correctPassword= "Omar2025";
        String userinput;
        int attempts=0;
        int maxAttempts=3;
        do {
            System.out.print("Enter Your Password:");
            userinput= Omar.nextLine();
            attempts++;

            if (userinput.equals(correctPassword)) {
                System.out.println("Correct Pasword");
                break;
            }else{
                    System.out.println("Wrong Password");
            }

        } while (!userinput.equals(correctPassword)&& attempts<maxAttempts);

        if (!userinput.equals(correctPassword)){
            System.out.println("Access denied. You have used all attempts.");
        }


    }
    }