import java.util.Scanner;
public class R6RC {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int MMR = 0;
    int ELO = 0;
    int customGoal = 0;
    int ammount = 0;

    System.out.print("Enter your current MMR:");
    MMR = input.nextInt();

    System.out.print("Enter your current ELO:");
    ELO = input.nextInt();

    System.out.print("Enter your custom goal:");
    customGoal = input.nextInt();

    ammount = ((customGoal - MMR) / ELO);

    if (ammount < 0) {
    System.out.println("you need to lose" + " " + ammount + " " + "matches in order to reach your goal");
    } else if (ammount > 0) {
    System.out.println("you need to win" + " " + ammount + " " + "matches in order to reach your goal");
    } else {
    System.out.println("You don't need to win or lose any matches to reach your rank goal");
    }

  }
}
