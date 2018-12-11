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
		int computerselect = Math.random()*3+1;

		switch (computerselect) {
			case 1: compChoice = "rock"; break;

			case 2: compChoice = "paper"; break;

			case 3: compChoice = "scissors"; break;

		}
	}

	public void setPlayers(String player)
	{
	}

	public String determineWinner()
	{
		String winner="";
		return winner;
	}

	public String toString()
	{
		String output="";
		return output;
	}
}
