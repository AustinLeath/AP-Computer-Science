//(c) A+ Computer Science
// www.apluscompsci.com

//if else example
import java.lang.System;
import java.util.Scanner;

public class IfElse {
  public static void main(String[] args) {
    while (true) {
    Scanner reader = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int seconds = reader.nextInt();

    if (seconds > 50) {
      System.out.println("GREATER THAN 50");
    }
    if (seconds < 50) {
      System.out.println("LESS THAN 50");
    }
    if (seconds == 50) {
      System.out.println("NUMBER IS EXACTLY 50");
   }
  }
 }
}
