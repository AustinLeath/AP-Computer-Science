import static java.lang.System.*;

public class Box
{
  private int size;

	public Box()
	{
	}

	public Box(int count)
	{
    setSize(count);
  }

	public void setSize(int count)
	{
    size = count;
	}

	public int getSize()
	{
    count.getSize();
		return 0;
	}

	public String toString()
	{
		String output="test";

    for (int i = 1; i <= 5; i++) {
    for (int j = 1; j <= 10; j++) {
    System.out.print("*");
    }
    System.out.println();
    // to end the line
    }
		return output;
	}
}
