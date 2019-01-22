public class PermuteString
{
    static void permute(String input)
    {
        int z = 0;
        int n = input.length();

        int max = 1 << n;

        input = input.toLowerCase();

        for(int i = 0;i < max; i++)
        {
            char combination[] = input.toCharArray();
            for(int j = 0; j < n; j++)
            {
                if(((i >> j) &  1) == 1)
                    combination[j] = (char) (combination[j]-32);
            }
            z++;
            System.out.print(z + " ");
            System.out.println(combination);
        }
    }
  }
