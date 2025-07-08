import java.util.Scanner;

public class ConvertTask {
    public static void main(String[] args) {
        Scanner omar = new Scanner(System.in);
        System.out.println("Enter Sentence");
        String Sentence = omar.nextLine();
        String Upper = Sentence.toUpperCase();
        int Length = Sentence.length();
        char FirstChracter= Sentence.charAt(0);
        System.out.println("UpperCase:" + Upper);
        System.out.println("Length:" + Length );
        System.out.println("First Chracter:" + FirstChracter);




    }
}