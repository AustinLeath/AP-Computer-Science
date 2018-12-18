import static java.lang.System.*;

public class Triples
{
  private int number;

	public Triples()
	{
		this(0);
	}

	public Triples(int num)
	{
    setNum(num);
	}

	public void setNum(int num)
	{
    number = num;
	}

	private int greatestCommonFactor(int a, int b, int c)
	{
    String triples = "";
		int max = number;

    for(int x = 1; x < max; x++) {
      for(int y = 1; y < max; y++) {
        for(int z = 1; z < max; z++){

          if(Math.pow(a,2) + Math.pow(b,2) == Math.pow(c,2)) {
            System.out.print(a + " " + b + " " + c);
          }

        }
      }
    }


		return 1;
	}

	public String toString()
	{
		String output= greatestCommonFactor();
		return output+"\n";
	}
}
