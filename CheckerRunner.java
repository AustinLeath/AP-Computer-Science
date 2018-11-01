public class CheckerRunner {
  public static void main(String[] args) {
    Checker test = new Checker(32,32);
    System.out.println(test);

    test.setNums(15,8);
    System.out.print(test);
  }
}
