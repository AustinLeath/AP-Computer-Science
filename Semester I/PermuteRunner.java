import java.lang.System;
import java.util.Scanner;

public class PermuteRunner {
 public static void main(String[] args)
 {
   PermuteString obj = new PermuteString();

   Scanner keyboard = new Scanner(System.in);

   String word;

   word = keyboard.next();

     obj.permute(word);
 }
}
