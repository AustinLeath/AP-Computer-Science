public class NestedForTri
{
   public static void main(String args[])
   {
		int stop = 9;

    for(int row = 1; row <= stop; row++) {
      for(int col = 1; col <= row; col++) {
        System.out.print("*");
      }
      System.out.println();
    }
	}
}
