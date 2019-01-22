import java.util.Scanner;
public class StringMathRunner {
    public static void main(String[] args) {
      String s = "10 5 5 10 7";
      StringMath test = new StringMath(s);
      
      System.out.println(test);
      
      System.out.println("count = "+ test.getCount());
      System.out.println("sum = "+ test.getSum());
      System.out.println("avg = " + test.getAverage());
    }
}
