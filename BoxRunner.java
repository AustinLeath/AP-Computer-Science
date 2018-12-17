import static java.lang.System.*;

public class BoxRunner
{
   public static void main( String args[] )
   {
      Box test = new Box(3);
      out.print(test);
      out.println();
      test.setSize(4);
      out.print(test);
      out.println();
      test.setSize(5);
      out.print(test);
      out.println();
      test.setSize(2);
      out.print(test);
      out.println();
      test.setSize(1);
      out.print(test);
	}
}
