import static java.lang.System.*;

public class GCD
{
	private int one, two;

	public GCD()
	{
		one = 0;
		two = 0;
	}

	public GCD(int numOne, int numTwo)
	{
		setNums(numOne, numTwo);
	}

	public void setNums(int numOne, int numTwo)
	{
		one = numOne;
		two = numTwo;
	}

	public long getGCD()
	{
		long gcd = 0;
		for (int i = 1; i <= two; i++){
				if (one % i == 0 && two % i == 0)
					gcd = i;
		}
		return gcd;
	}

	public String toString()
	{
		return "The GCD of " + one + " and " + two + " is " + getGCD();
	}
}
