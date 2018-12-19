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
	int max = number;

   for(int d = a; d >= 1; d--)
   {
      if((a%d==0) && (b%d==0) && (c%d==0)) {
        return d;
      }
   }
   return 2;
 }

	public String toString()
	{
    int max = number;
    String output = "";
    for(int x = 1; x < max; x++)
    {
      for(int y = 1; y < max; y++)
      {
        for(int z = 1; z < max; z++)
        {
          if((x<y) && (z>y))
          {
            if(Math.pow(x,2) + Math.pow(y,2) == Math.pow(z,2))
            {
              if(((x%2==0) && (y%2==1)) || ((x%2==1) && (y%2==0)))
              {
                if(greatestCommonFactor(x, y, z) == 1)
                {
                  output = output + x + " " + y + " " + z + "\n";
                }
              }
            }
          }
        }
      }
    }
    return output;
	}
}
