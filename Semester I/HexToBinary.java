import static java.lang.System.*;
import java.util.Scanner;

public class HexToBinary
{
	public static String getBinary(char hex)
	{
		switch (hex) {
			case 'A': out.print("A is 1010 in binary"); break;
			case 'B': out.print("B is 1011 in binary"); break;
			case 'C': out.print("C is 1100 in binary"); break;
			case 'D': out.print("D is 1101 in binary"); break;
			case 'E': out.print("E is 1110 in binary"); break;
			case 'F': out.print("F is 1111 in binary"); break;
			default: out.print(hex + " is ERROR in binary"); break;
		}
		return "";
	}
}
