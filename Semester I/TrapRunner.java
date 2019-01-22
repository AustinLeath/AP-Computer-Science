import java.util.Scanner;
public class TrapRunner {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int base1 = 0;
    System.out.print("Enter base1: ");
    base1 = reader.nextInt();
    System.out.print("Enter base2");
    base2 = reader.nextInt();
    System.out.print("Enter Height");
    height = reader.nextInt();
    System.out.print(Trap.area(base1,base2,height));
  }
}
