import static java.lang.System.*;
import java.util.Scanner;

public class TheLine
{
   private String line;

   public TheLine()
   {
      line = "";
   }

   public TheLine(String s)
   {
      line = s;
   }

	public int getLargest()
	{
      Scanner scan = new Scanner(line);
      int largest = Integer.MIN_VALUE;
      while(scan.hasNextInt()) {
         int loc = scan.nextInt();
         if(loc>largest)
				largest = loc;
      }
		return largest;
	}

	public String toString( )
	{
		return (line + " - Largest == " + getLargest());
	}
}