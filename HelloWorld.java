import java.lang.System;
import java.util.Scanner;
public class HelloWorld {
  public static void main(String[] args) {

      Scanner keyboard = new Scanner(System.in);

      System.out.print("Enter your new password: ");
      String passwordone = keyboard.next();

      System.out.print("Re-enter your password: ");
      String passwordtwo = keyboard.next();

      if(passwordone.equals(passwordtwo)) {
         System.out.println("Thank you! your password matches!");
      } else {
         System.out.println("Sorry, the password you entered was not identical to the one you created please try again.");
      }

      System.out.print("Create a bio:");
      String biography = keyboard.next();

    }
}
