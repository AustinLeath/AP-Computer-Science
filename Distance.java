import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Distance
{
	private int x1,y1,x2,y2;

	public Distance()
	{

	}

	public Distance(int xOne, int yOne, int xTwo, int yTwo)
	{

	}

	public void setCoordinates(int xOne, int yOne, int xTwo, int yTwo)
	{
      x1=xOne;
      x2=xTwo;
      y1=yOne;
      y2=yTwo;
	}

	public String determineClosest( )
	{
		double distanceA = 0.0, distanceB = 0.0;
		String result="";
      distanceA = Math.sqrt((Math.pow((x1),2)) + (Math.pow((y1),2)));
      distanceB = Math.sqrt((Math.pow((x2),2)) + (Math.pow((y2),2)));
         if (distanceA > distanceB)
         System.out.println("B is closer to (0,0)");
         else
         System.out.println("A is closer to (0,0)");
		return result;
	}

	public String toString()
	{
		return "";
	}
}
