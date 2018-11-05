import java.util.Scanner;
import java.lang.System;

public class UserLogin {

  public static void main(String[] args) {
    UserLogin authenticate = new UserLogin();
    authenticate.createUser();
  }

Scanner keyboard = new Scanner(System.in);

public int i = 0;
public int qc = 4;

public void createUser() {

  String username;
  String passwordone;
  String passwordtwo;

  System.out.print("Enter your desired username: ");
  username = keyboard.next();
  System.out.print("\n");

  System.out.print("New password: ");
  passwordone = keyboard.next();
  System.out.print("\n");

  System.out.print("Re enter your password: ");
  passwordtwo = keyboard.next();
  System.out.print("\n");

  if (passwordone.equals(passwordtwo)) {
      System.out.println("The passwords that you entered are a match!");
      System.out.println("Here is the user information that you provided:\n");
      System.out.println("Username: " + username);
      System.out.println("Password: " + passwordone + "\n");
      System.out.println("You will now be asked a series of yes or no questions.\n");
      Questionone();
  } else {
      TryAgain();
  }
}

public void TryAgain() {
  System.out.println("The passwords that you provided are not identical, please try again.\n");
  createUser();
}

public void Questionone() {
  System.out.print("Is the earth round? ");
  String answer = keyboard.next();

  if(answer.equals("yes") || answer.equals("Yes") || answer.equals("yEs") || answer.equals("YEs") || answer.equals("yeS") || answer.equals("YeS") || answer.equals("yES") || answer.equals("YES") || answer.equals("Yes")) {
      System.out.println("Correct, the earth is round\n");
      i++;
      Questiontwo();
  } else if(answer.equals("no") || answer.equals("No") || answer.equals("nO") || answer.equals("NO") || answer.equals("No")) {
      System.out.println("False, the earth is round\n");
      Questiontwo();
  } else {
      System.out.println("The answer you submitted is a yes or no question, try again\n");
      Questionone();
  }
 }

 public void Questiontwo() {
   System.out.print("Does 2 + 2 = 4? ");
   String answer = keyboard.next();

   if(answer.equals("yes") || answer.equals("Yes") || answer.equals("yEs") || answer.equals("YEs") || answer.equals("yeS") || answer.equals("YeS") || answer.equals("yES") || answer.equals("YES")) {
      System.out.println("Correct, 2 + 2 = 4\n");
      i++;
      Questionthree();
   } else if(answer.equals("no") || answer.equals("No") || answer.equals("nO") || answer.equals("NO")) {
      System.out.println("False, 2 + 2 = 4\n");
      Questionthree();
   } else {
      System.out.println("The answer you submitted is a yes or no question, try again\n");
      Questiontwo();
  }
 }

 public void Questionthree() {
   System.out.print("Is Dallas the capital of Texas? ");
   String answer = keyboard.next();

   if(answer.equals("yes") || answer.equals("Yes") || answer.equals("yEs") || answer.equals("YEs") || answer.equals("yeS") || answer.equals("YeS") || answer.equals("yES") || answer.equals("YES")) {
      System.out.println("False, Austin is the capital of Texas\n");
      Questionfour();
   } else if(answer.equals("no") || answer.equals("No") || answer.equals("nO") || answer.equals("NO")) {
      System.out.println("Correct, Austin is the capital of Texas\n");
      i++;
      Questionfour();
   } else {
      System.out.println("The answer you submitted is a yes or no question, try again\n");
      Questionthree();
  }
 }

 public void Questionfour() {
   System.out.print("Are black bears actually black? ");
   String answer = keyboard.next();

   if(answer.equals("yes") || answer.equals("Yes") || answer.equals("yEs") || answer.equals("YEs") || answer.equals("yeS") || answer.equals("YeS") || answer.equals("yES") || answer.equals("YES")) {
      System.out.println("True, black bears are indeed black\n");
      i++;
      Questionfive();
   } else if(answer.equals("no") || answer.equals("No") || answer.equals("nO") || answer.equals("NO")) {
      System.out.println("False, black bears are actually black\n");
      Questionfive();
   } else {
      System.out.println("The answer you submitted is a yes or no question, try again\n");
      Questionfour();
  }
 }

 public void Questionfive() {
   System.out.print("Does 9 x 9 = 81?");
   String answer = keyboard.next();

   if(answer.equals("yes") || answer.equals("Yes") || answer.equals("yEs") || answer.equals("YEs") || answer.equals("yeS") || answer.equals("YeS") || answer.equals("yES") || answer.equals("YES")) {
      System.out.println("Correct, 9 x 9 = 81\n");
      i++;
      gradeTest();
   } else if(answer.equals("no") || answer.equals("No") || answer.equals("nO") || answer.equals("NO")) {
      System.out.println("Incorrect, 9 x 9 = 81\n");
      gradeTest();
   } else {
      System.out.println("The answer you submitted is a yes or no question, try again\n");
      Questionfive();
  }
 }

 public void gradeTest() {
   System.out.println("Thank you for your responses, you answered " + i + " out of " + qc + " questions correctly.");
 }
}

//combinations of the word "yes": yes Yes yEs YEs yeS YeS yES YES
//combinations of the word "no": no No nO NO
