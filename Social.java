//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Austin Leath
//Date - 10/19/18

public class Social
{
   public static String go( String a )
	{
      if (a.charAt(3) == '-') {
        if(a.charAt(6) == '-')
          return a.substring(7,11);
      }
    return "bad";
  }
}
