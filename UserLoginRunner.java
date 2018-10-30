import java.util.Scanner;
import java.lang.System;

public class UserLoginRunner {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    UserLogin authenticate = new UserLogin();

    authenticate.CreateUser();
  }
}
