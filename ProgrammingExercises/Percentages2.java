import java.util.Scanner;

public class Percentages2
{
   public static void main(String args[])
   {
      double a;
      Scanner inputNum1 = new Scanner(System.in);
      System.out.println("Enter Number 1 (in decimal form): ");
      a = inputNum1.nextInt();

      double b;
      Scanner inputNum2 = new Scanner(System.in);
      System.out.println("Enter Number 2 (in decimal form): ");
      b = inputNum2.nextInt();

      computePercent(a, b);
   }

   public static void computePercent(double num1, double num2)
   {
      double percent = ((num1 / num2) * 100);
      int percentInt = (int)percent;
      System.out.println(num1 + " is " + percentInt + " percent of " + num2);
   }
}
