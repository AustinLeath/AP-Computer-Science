import java.lang.System;
import java.util.Scanner;
public class HelloWorld {
  public static void main(String[] args) {
      test answer = new test();
      testb();
   }
public class test {
   public boolean compare() {
      if(1 == 1) {
      return true;
      } else {
      return false;
      }
   }
   public String testb() {
      if(compare()) {
        return "comparison was true";
      } else {
        return "comparison was false";
    }
  }
}
}
