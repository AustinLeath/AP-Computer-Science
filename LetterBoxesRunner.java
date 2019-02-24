//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class LetterBoxesRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		LetterBoxes doc = new LetterBoxes();

		char letter;
		int size;

		out.print("Enter the letter for the box :: ");
		letter = keyboard.next().charAt(0);
		out.println();

		out.print("Enter the size of the box :: ");
		size = keyboard.nextInt();
		out.println();

		doc.printBox(letter, size);
		out.println();

		char prompt;
		out.print("Would you like to enter more sample input? ");
		prompt = keyboard.next().charAt(0);
		out.println();

		do {
			out.print("Enter the letter for the box :: ");
			letter = keyboard.next().charAt(0);
			out.println();

			out.print("Enter the size of the box :: ");
			size = keyboard.nextInt();
			out.println();

			doc.printBox(letter, size);
			out.println();

			out.print("Would you like to enter more sample input? ");
			prompt = keyboard.next().charAt(0);
			out.println();
		} while (prompt == 'y' || prompt == 'Y');
	}
}
