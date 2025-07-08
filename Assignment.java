import java.util.Scanner;

public class Assignment {
  public static void main (String[] args)
  {
      Scanner ass_1 = new Scanner (System.in) ;
      System.out.println("Enter First Number");
      double num1 = ass_1.nextInt();
      System.out.println("Enter Second Number");
      double num2 = ass_1.nextInt();
      double plus = num1 + num2;
      double div = num1 / num2;
      double multip = num1 * num2;
      double substraction = num1 - num2 ;
              System.out.println("Addtion= " + plus);
              System.out.println("Division=" + div);
              System.out.println("Multiplication=" + multip);
              System.out.println("Substraction= " + substraction);


  }
}
