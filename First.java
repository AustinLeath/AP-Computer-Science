public class First
{
   public static String go( String a )
	{
    char x = a.charAt(0);
    if(a.indexOf(x,1) == -1) {
      return "no";
    } else {
      return "yes";
    }
  }
}
