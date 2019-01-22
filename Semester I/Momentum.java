import java.util.Scanner;

public class Momentum {
  public static void main(String[] args) {
  while (true) {
    Scanner reader = new Scanner(System.in);
    double Mass = 0;
    double Velocity = 0;
    double Momentum = 0;

    System.out.print("Enter the Mass:" + " ");
    Mass = reader.nextDouble();

    System.out.print("Enter the Velocity:" + " ");
    Velocity = reader.nextDouble();

    Momentum = Mass * Velocity;
    System.out.println("The Momentum is:" + " " + Momentum);
    }
  }
}
