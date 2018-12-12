import static java.lang.System.*;

public class CoolNumbers
{
	public static boolean isCoolNumber( int num )
	{
		 if (num % 3 == 1 && num % 4 ==1 && num % 5 ==1 && num % 6 == 1 )
		      return true;
		 return false;
	}

	public static int countCoolNumbers( int stop )
	{
		int count = 0;

		for (int num = 6;  num <= stop;  num++)
		{
			   if(isCoolNumber(num))
			   {
			   		count = count + 1;
			   }
		}
		return count;
	}
}
