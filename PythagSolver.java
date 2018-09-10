import java.util.Scanner;

public class PythagSolver {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    double A = 0.0;
    double B = 0.0;
    double C = 0.0;

    while (true) {
    System.out.print("Enter value for A: ");
    A = reader.nextDouble();

    System.out.print("Enter value for B: ");
    B = reader.nextDouble();

    System.out.print("Enter value for C: ");
    C = reader.nextDouble();

    if (A == '0') {
      System.out.println((B * B) + (C * C));
    }
    if (B == '0') {
      System.out.println((A * A) + (C * C));
    }
    if (C == '0') {
      System.out.println((A * A) + (B * B));
    }
   }
  }
}
