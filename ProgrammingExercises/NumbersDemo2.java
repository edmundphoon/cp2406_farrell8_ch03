import java.util.Scanner;

public class NumbersDemo2
{
   public static void main(String args[])
   {
      int a;
      Scanner inputNum1 = new Scanner(System.in);
      System.out.println("Enter Number 1: ");
      a = inputNum1.nextInt();

      int b;
      Scanner inputNum2 = new Scanner(System.in);
      System.out.println("Enter Number 2: ");
      b = inputNum2.nextInt();

      displayTwiceTheNumber(a, b);
      displayNumberPlusFive(a, b);
      displayNumberSquared(a, b);
   }

   public static void displayTwiceTheNumber(int num1, int num2)
   {
      System.out.println("Two times of " + num1 +
        " is equal to " + (num1 * 2));
      System.out.println("Two times of " + num2 +
              " is equal to " + (num2 * 2));
   }

   public static void displayNumberPlusFive(int num1, int num2)
   {
      System.out.println(num1 + " + 5 is equal to " + (num1 + 5));
      System.out.println(num2 + " + 5 is equal to " + (num2 + 5));
   }

   public static void displayNumberSquared(int num1, int num2)
   {
      System.out.println(num1 + " squared is " + (num1 * num1));
      System.out.println(num2 + " squared is " + (num2 * num2));
   }
}
