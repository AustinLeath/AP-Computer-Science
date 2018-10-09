//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class DistanceRunner
{
	public static void main( String[] args )
	{
			Scanner kb = new Scanner (System.in);
			         
         System.out.print("Enter X1 :: ");
         int x1 = kb.nextInt(); 
         
         System.out.print("Enter y1 :: ");
         int y1 = kb.nextInt(); 
         
         System.out.print("Enter X2 :: ");
         int x2 = kb.nextInt();
         
         System.out.print("Enter y2 :: ");
         int y2 = kb.nextInt();
         
         Distance test = new Distance(x1 , y1 , x2 , y2);
         test.setCoordinates(x1,y1,x2,y2);
         test.calcDistance();
         test.print(); 
         

	}
}