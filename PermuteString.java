public class PermuteString
{
    // Function to generate permutations
    static void permute(String input)
    {
        int z = 0;
        int n = input.length();

        // Number of permutations is 2^n
        int max = 1 << n;

        // Converting string to lower case
        input = input.toLowerCase();

        // Using all subsequences and permuting them
        for(int i = 0;i < max; i++)
        {
            char combination[] = input.toCharArray();

            // If j-th bit is set, we convert it to upper case
            for(int j = 0; j < n; j++)
            {
                if(((i >> j) &  1) == 1)
                    combination[j] = (char) (combination[j]-32);
            }

            // Printing current combination
            z++;
            System.out.print(z + " ");
            System.out.println(combination);


        }
    }
  }
