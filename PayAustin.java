import java.util.Scanner;
public class PayAustin {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    double HourlyPay = 0.0;
    double WeeklyHours = 0.0;
    double OvertimeHours = 0.0;
    double OvertimePay = 0.0;


    System.out.print("Enter hourly pay:");
    HourlyPay = input.nextDouble();

    System.out.print("Enter the hours you work a week:");
    WeeklyHours = input.nextDouble();

    System.out.print("Enter your overtime hours:");
    OvertimeHours = input.nextDouble();

    OvertimePay = ((HourlyPay * WeeklyHours) + ((HourlyPay * 1.5) * OvertimeHours));
    System.out.print("You will be paid: \u0024");
    System.out.print(OvertimePay);
    System.out.print(" this week");
  }
}
