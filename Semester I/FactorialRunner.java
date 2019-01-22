import static java.lang.System.*;

public class FactorialRunner
{
	public static void main ( String[] args )
	{
		Factorial obj = new Factorial(5);
		out.println(obj);

		obj.setNum(4);
		out.println(obj);

		obj.setNum(8);
		out.println(obj);

		obj.setNum(15);
		out.println(obj);

		obj.setNum(6);
		out.println(obj);

		obj.setNum(9);
		out.println(obj);

		obj.setNum(3);
		out.println(obj);
	}
}
