import static java.lang.System.*;
import java.util.Scanner;

public class StringRunner
{
	public static void main ( String[] args )
	{
		StringOddOrEven test = new StringOddOrEven();
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter a word.");
		String s = keyboard.nextLine();
		test.setString(s);
		System.out.println(test);

		System.out.println("Enter a word.");
		s = keyboard.nextLine();
		test.setString(s);
		System.out.println(test);


		System.out.println("Enter a word.");
		s = keyboard.nextLine();
		test.setString(s);
		System.out.println(test);

	}
}
