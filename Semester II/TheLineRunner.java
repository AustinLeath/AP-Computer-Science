import java.io.IOException;
import java.io.File;
import java.util.Scanner;
import static java.lang.System.*; 

public class TheLineRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("line.dat"));
		int size = file.nextInt();
		file.nextLine();
		for(int i=0; i<size; i++)
		{
         String s = file.nextLine();
         TheLine test = new TheLine(s);
         System.out.println(test);
		}
      file.close();
	}
}