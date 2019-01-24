//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Austin Leath
//Date -

public class SmallestRunner
{
	public static void main( String args[] )
	{
   
      RaySmallest test = new RaySmallest();
      int[] intArray1 = new int[]{-99,1,2,3,4,5,6,7,8,9,10,12345};
      
      int[] intArray2 = new int[]{10,9,8,7,6,5,4,3,2,1,-99};
      
      int[] intArray3 = new int[]{10,20,30,40,50,-11818,40,30,20,10};
      
      int[] intArray4 = new int[]{32767};
      
      int[] intArray5 = new int[]{255,255};
      
      int[] intArray6 = new int[]{9,10,-88,100,-555,1000};
      
      int[] intArray7 = new int[]{10,10,10,11,456};
      
      int[] intArray8 = new int[]{-111,1,2,3,9,11,20,30};
      
      int[] intArray9 = new int[]{9,8,7,6,5,4,3,2,0,-2,-989};
      
      int[] intArray10 = new int[]{12,15,18,21,23,1000};
      
      int[] intArray11 = new int[]{250,19,17,15,13,11,10,9,6,3,2,1,-455};
      
      int[] intArray12 = new int[]{9,10,-8,10000,-5000,1000};
        
      test.go(intArray1);
      test.go(intArray2);
      test.go(intArray3);
      test.go(intArray4);
      test.go(intArray5);
      test.go(intArray6);
      test.go(intArray7);
      test.go(intArray8);
      test.go(intArray9);
      test.go(intArray10);
      test.go(intArray11);
      test.go(intArray12);					
	}
}