import static java.lang.System.*;

public class TenToAny
{
   private int base10;
   private int newBase;

   public TenToAny()
   {
      base10 = newBase = 0;
   }

   public TenToAny(int base10, int newBase)
   {
      setNums(base10,newBase);
   }

   public void setNums(int base10Param, int newBaseParam)
   {
      base10 = base10Param;
      newBase = newBaseParam;
   }

	public String getNewNum()
	{
		String newNum = "";
      int lastDigit = 0;
      String tempNewNum = "";

      do
      {
         lastDigit = (int)((double)base10 % newBase);

         if (lastDigit > 9)
         {
            switch (lastDigit)
            {
               case 10: tempNewNum += "A";break;
               case 11: tempNewNum += "B";break;
               case 12: tempNewNum += "C";break;
               case 13: tempNewNum += "D";break;
               case 14: tempNewNum += "E";break;
               case 15: tempNewNum += "F";break;
               default: return "not supported";
            }

         } else {
            tempNewNum += lastDigit;
         }
         base10 /= newBase;

      } while (base10 > 0);

      for (int i = tempNewNum.length() - 1; i >= 0; i--)
      {
         newNum += tempNewNum.substring(i, i+1);
      }

		return newNum;
	}

   public String toString()
   {
      return base10 + " base 10 is " + getNewNum() + " in base " + newBase;
   }

}
