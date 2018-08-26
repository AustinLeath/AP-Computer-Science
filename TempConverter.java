import java.util.Scanner;

public class TempConverter
{
   public static void main(String[] args)
   {
    while (true) {
      Scanner reader = new Scanner(System.in);
      double fahrenheit = 0.0;
      double celsius;

      System.out.print("Enter degrees Fahrenheit: ");
      fahrenheit = reader.nextDouble();

      celsius = (fahrenheit - 32.0) * 0.5556;

      System.out.println("The equivalent in Celsius is " + celsius + "\u00b0" + "Celsius");
      System.out.println("In Kelvin " + fahrenheit + "\u00b0 Fahrenheit is: " + (fahrenheit + 273) + "\u00b0 Kelvin" );
    }
   }
  }
