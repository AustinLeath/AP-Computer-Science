import java.util.Scanner;
import static java.lang.System.*;

class PasswordCheck
{
   private String password;

   public PasswordCheck()
   {
      password = "test1234";
   }

   public void check()
   {
      Scanner keyboard = new Scanner(System.in);
      String input = "";
      do
      {
         out.print("Enter the Password :: ");
         input = keyboard.next();
         if (password.equals(input))
            out.println("VALID");
          else
            out.println("INVALID");
      }  while (!password.equals(input));
   }
}
