// This application gets a user's name and displays a greeting
import java.util.Scanner;

public class BookstoreCredit
{
   public static void main(String args[])
   {
      String name;
      Scanner inputName = new Scanner(System.in);
      System.out.println("Enter your name: ");
      name = inputName.nextLine();

      double gradePointAverage;
      Scanner inputNum = new Scanner(System.in);
      System.out.println("Enter your grade point average: ");
      gradePointAverage = inputNum.nextInt();

      computeCredit(name, gradePointAverage);
   }

   public static void computeCredit(String name, double gradePointAverage)
   {
      double credit = gradePointAverage * 10;
      int creditInt = (int)credit;
      System.out.println("Name: " + name);
      System.out.println("Grade Point Average: " + gradePointAverage);
      System.out.println("Bookstore Credit: " + credit);
   }
}
