//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Austin Leath
//Date -

public class RaySmallest
{
	public static int go(int[] ray)
	{
   int smallest = Integer.MAX_VALUE;
   for(int item : ray)
		{
        int num = item;
          if(num<smallest)
          {
            smallest=num;
          }
		}
      System.out.println(smallest + " ");
      return 0;
	}
}




