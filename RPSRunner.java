import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner {

    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        Scanner replay = new Scanner(in);
        String playAgain = "";

        do {
            out.print("Rock-Paper-Scissors - pick your weapon[R,P,S]:: ");
            String player = keyboard.nextLine();
            out.println();
            RockPaperScissors game = new RockPaperScissors(player);
            out.println(game);
            out.println();
            out.print("Do you want to play again? ");
            playAgain = keyboard.nextLine();
            out.println();
        } while (playAgain.toLowerCase().equals("y") || playAgain.toLowerCase().equals("yes"));
    }
}
