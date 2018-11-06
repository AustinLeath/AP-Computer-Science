
import static java.lang.System.*;

public class MorseCodeRunner
{
	public static void main( String args[] )
	{
	  MorseCode obj = new MorseCode('A');
		out.println(obj.getMorseCode());

		out.println(obj);
		out.println();

		obj.setChar('B');
		out.println(obj.getMorseCode() + "\n" + obj + "\n");

		obj.setChar('3');
		out.println(obj.getMorseCode() + "\n" + obj + "\n");


		obj.setChar('Z');
		out.println(obj.getMorseCode() + "\n" + obj + "\n");


		obj.setChar('8');
		out.println(obj.getMorseCode() + "\n" + obj + "\n");


		obj.setChar('F');
		out.println(obj.getMorseCode() + "\n" + obj + "\n");


		obj.setChar('0');
		out.println(obj.getMorseCode() + "\n" + obj + "\n");


	}
}
