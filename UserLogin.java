import java.util.Scanner;
import java.lang.System;

public class UserLogin {
Scanner keyboard = new Scanner(System.in);

public void CreateUser() {
  System.out.print("Enter your desired username: ");
  String username = keyboard.next();

  System.out.print("New password: ");
  String passwordone = keyboard.next();

  System.out.print("Re enter your password: ");
  String passwordtwo = keyboard.next();

  if (passwordone.equals(passwordtwo)) {
      Confirmation();
  } else {
      TryAgain();
  }
}

public void Confirmation() {
  System.out.println("The passwords that you entered are a match!");
  StartGame();
}

public void TryAgain() {
  System.out.println("The passwords that you provided are not identical, please try again.");
  CreateUser();
}

public void StartGame() {
  System.out.println("GAME STARTS HERE");
 }
}
