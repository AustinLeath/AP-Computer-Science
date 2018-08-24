import java.util.Scanner;

public class TempConverter
{
   public static void main(String[] args)
   {
      Scanner reader = new Scanner(System.in);
      double fahrenheit = 0.0;
      double celsius;

      System.out.print("Enter degrees Fahrenheit: ");
      fahrenheit = reader.nextDouble();

      celsius = (fahrenheit - 32.0) * 0.5556;

      System.out.print("The equivalent in Celsius is" + " " + celsius +  "\u00b0" + " " + "Celsius");
   }
}
