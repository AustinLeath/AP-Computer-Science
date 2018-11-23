import static java.lang.System.*;

public class TriangleOneRunner
{
	public static void main ( String[] args )
	{
		TriangleOne test = new TriangleOne();

      test.setWord("hippo");
      test.print();

			System.out.println();

			test.setWord("abcd");
			test.print();

			System.out.println();

			test.setWord("it");
			test.print();

			System.out.println();

			test.setWord("a");
			test.print();

			System.out.println();

			test.setWord("chicken");
			test.print();
	}
}
