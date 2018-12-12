//(c) A+ Computer Science
// www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;

	public RockPaperScissors()
	{
	}

	public RockPaperScissors(String player)
	{
		 setPlayers(player);
	}

	public void setPlayers(String player) {
		playChoice = player;
		int comp = (int)(Math.random() * 3);
		if (comp == 1) {
				compChoice = "p";
		} else if (comp == 2) {
				compChoice = "s";
		} else {
				compChoice = "r";
		}
}

	public String determineWinner() {
		String winner = "";

		if (compChoice.toLowerCase().equals("p") && playChoice.toLowerCase().equals("r")) {
				winner = "!Computer wins <<Paper Beats Rock>>!";
		} else if (compChoice.toLowerCase().equals("r") && playChoice.toLowerCase().equals("s")) {
				winner = "!Computer wins <<Rock beats Scissors>>!";
		} else if (compChoice.toLowerCase().equals("s") && playChoice.toLowerCase().equals("p")) {
				winner = "!Computer wins <<Scissors beats paper>>!";
		} else if (compChoice.toLowerCase().equals("p") && playChoice.toLowerCase().equals("s")) {
				winner = "!Player wins <<Scissors beats Paper>>!";
		} else if (compChoice.toLowerCase().equals("s") && playChoice.toLowerCase().equals("r")) {
				winner = "!Player wins <<Rock beats Scissors>>!";
		} else if (compChoice.toLowerCase().equals("r") && playChoice.toLowerCase().equals("p")) {
				winner = "!Player wins <<Paper beats Rock>>!";
		} else {
				winner = "!Draw Game!";
		}
		return winner;
}

	public String toString()
	{
		String output = "";
		output = "Player had :: " + playChoice + "\n" + "Computer had :: " + compChoice + "\n" + determineWinner();
		return output;
	}
}
