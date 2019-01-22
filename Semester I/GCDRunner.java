import static java.lang.System.*;

public class GCDRunner
{
	public static void main ( String[] args )
	{
		GCD obj = new GCD();

		obj.setNums(5, 25);
		System.out.print(obj);
		System.out.println();

		obj.setNums(4, 400);
		System.out.print(obj);
		System.out.println();

		obj.setNums(8, 80);
		System.out.print(obj);
		System.out.println();

		obj.setNums(15, 45);
		System.out.print(obj);
		System.out.println();

		obj.setNums(6, 66);
		System.out.print(obj);
		System.out.println();

		obj.setNums(9, 9);
		System.out.print(obj);
		System.out.println();

		obj.setNums(9, 543);
		System.out.print(obj);
		System.out.println();

		obj.setNums(15, 40);
		System.out.print(obj);
		System.out.println();

		obj.setNums(6, 51);
		System.out.print(obj);
		System.out.println();
	}
}
