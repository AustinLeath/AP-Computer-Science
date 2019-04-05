public class RayMostFreq
{
	//method go will return the value 
	//that appears the most
	//if several numbers all appear
	//the same number of times
	//return the first number found
   public static int go(int[] ray)
	{
		int frequent = 0;
		int max = Integer.MIN_VALUE;
		int count = 0;
		for( int i = 0; i < ray.length; i++ )
		{ 
			count = 0;
			for( int j = 0; j < ray.length; j++)
			{
				if( ray[i] == ray[j] && i!=j )
					count++;
			}
			if(count > max)
			{
				max = count;
				frequent = ray[i];
			}
		}
      System.out.println(frequent);			
		return frequent;
	}
}