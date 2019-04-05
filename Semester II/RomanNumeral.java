//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class RomanNumeral
{
	private Integer number;
	private String roman;

	private final static int[] NUMBERS = {1000,900,500,400,100,90,
													50,40,10,9,5,4,1};

	private final static String[] LETTERS = {"M","CM","D","CD","C","XC",
												  "L","XL","X","IX","V","IV","I"};

	public RomanNumeral(String str)
	{
      roman = str;
	}

	public RomanNumeral(Integer orig)
	{
     
	}

	public void setNumber(Integer num)
	{
      number = num;
	}

	public void setRoman(String rom)
	{  
      roman = rom;
	}

	public Integer getNumber()
	{
   
   Integer technicalnum = number;
		return technicalnum;
	}

	public String toString()
	{
      return roman + "\n";
	}
}