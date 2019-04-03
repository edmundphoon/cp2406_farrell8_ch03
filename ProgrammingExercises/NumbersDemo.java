public class NumbersDemo
{
   public static void main(String args[])
   {
      int a = 2, b = 5;
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
