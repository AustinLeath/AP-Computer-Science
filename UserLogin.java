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
  Questionone();
}

public void TryAgain() {
  System.out.println("The passwords that you provided are not identical, please try again.");
  CreateUser();
}

public void Questionone() {
  System.out.print("Is the earth round? ");
  String answer = keyboard.next();

  if(answer.equals("yes")) {
      System.out.println("Correct, the earth is round");
      Questiontwo();
  } else if(answer.equals("no")) {
      System.out.println("False, the earth is round");
      Questiontwo();
  } else {
      System.out.println("The answer you submitted is a yes or no question, try again");
      Questionone();
  }
 }

 public void Questiontwo() {
   System.out.print("Is the sum of 2+2 = 4? ");
   String answer = keyboard.next();

   if(answer.equals("yes")) {
      System.out.println("Correct, 2+2 = 4");
      Questionthree();
   } else if(answer.equals("no")) {
      System.out.println("False, 2+2 = 4");
      Questionthree();
   } else {
      System.out.println("The answer you submitted is a yes or no question, try again");
      Questiontwo();
   }
 }

 public void Questionthree() {
   System.out.print("Is Dallas the capital of Texas? ");
   String answer = keyboard.next();

   if(answer.equals("yes")) {
      System.out.println("False, Austin is the capital of Texas");
      Questionfour();
   } else if(answer.equals("no")) {
      System.out.println("Correct, Austin is the capital of Texas");
      Questionfour();
   } else {
      System.out.println("The answer you submitted is a yes or no question, try again");
      Questionthree();
   }
 }

 public void Questionfour() {
   System.out.print("Are black bears actually black? ");
   String answer = keyboard.next();

   if(answer.equals("yes")) {
      System.out.println("True, black bears are indeed black");
      Endoftest();
   } else if(answer.equals("no")) {
      System.out.println("False, black bears are actually black");
      Endoftest();
   } else {
      System.out.println("The answer you submitted is a yes or no question, try again");
      Questionfour();
   }
 }

 public void Endoftest() {
   System.out.println("Thank you for your responses");
 }
}
