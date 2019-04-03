public class Percentages
{
   public static void main(String args[])
   {
      double a = 2.0, b = 5.0;
      computePercent(a, b);
   }

   public static void computePercent(double num1, double num2)
   {
      double percent = ((num1 / num2) * 100);
      int percentInt = (int)percent;
      System.out.println(num1 + " is " + percentInt + " percent of " + num2);
   }
}
