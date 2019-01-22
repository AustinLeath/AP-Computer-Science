public class IfElseIfUIL
{
	public static String checkScore( int uilScore )
	{
		if (uilScore <= 130)
				return "take more tests";
		else if (uilScore < 220)
				return "district bound";
		else if (uilScore < 240)
				return "region bound";
		else if (uilScore == 240)
				return "state bound";
		else if (uilScore > 240)
				return "invalid score";
		return "";
	}

	public static void main(String args[])
	{
		int score = 220;
		System.out.println( checkScore( score ) );

		score = 240;
		System.out.println( checkScore( score ) );

		score = 130;
		System.out.println( checkScore( score ) );

		score = 190;
		System.out.println( checkScore( score ) );
	}
}
