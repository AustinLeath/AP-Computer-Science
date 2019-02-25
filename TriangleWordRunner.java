import static java.lang.System.*;
import java.util.Scanner;
public class TriangleWordRunner
{
   public static void main(String args[])
   {
    Scanner keyboard = new Scanner(System.in);
    TriangleWord doc = new TriangleWord();
    String word;
    String prompt;
  		do {
  			out.print("Enter a word:: ");
  			word = keyboard.next();
  			out.println();
        doc.setWord(word);
        out.print(doc);
        out.println();
  			out.print("Would you like to enter more sample input? ");
  			prompt = keyboard.next();
  			out.println();
  		} while (prompt.toLowerCase().equals("y"));
	}
}
