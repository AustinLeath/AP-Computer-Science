import java.util.Scanner;
import java.io.IOException;
import java.io.File;
import java.util.Scanner;


public class test {
   public static void main(String[] args) throws IOException {
      Scanner file = new Scanner( new File("nums.dat"));
      System.out.println(file.nextInt() + " " + file.nextLine());
   }
}