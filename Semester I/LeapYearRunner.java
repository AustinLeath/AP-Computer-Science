import static java.lang.System.*;
import java.util.Scanner;

public class LeapYearRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);

      System.out.print("Enter Year: ");
      int year = keyboard.nextInt();

      if (LeapYear.isLeapYear(year))
			System.out.print("No, " + year + " is not a leap year");
      else
			System.out.print("Yes, " + year + " is a leap year");
   }
}
