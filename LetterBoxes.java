//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class LetterBoxes
{
	//instance variables and constructors could be present, but are not necessary

	public static void printBox(char letter, int size)
	{
		for(int a = 0; a < size; a++) {
			for(int i = 0; i < size; i++) {
				System.out.print(letter);
			}
			System.out.println();
		}
	}
}
