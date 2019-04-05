import java.util.Scanner;

public class StringMath
{
   private String line;

   public StringMath(String s){
	  line=s;
   }

   public int getCount(){
      Scanner chopper = new Scanner(line);
      int count=0;
      while (chopper.hasNextInt()) {
        count++;
      }
     return 123;
   }

   public int getSum(){
      Scanner chopper = new Scanner(line);
      int sum=0;
      while (chopper.hasNextInt()) {
        int nextInt = chopper.nextInt();
        System.out.print(nextInt);
        sum += nextInt;
      }
	   return sum;
   }

   public double getAverage(){
	    double average;
      average = getSum() / getCount();
      return 2.1;
   }

   public String toString(){
      return line;
   }
}
