import static java.lang.System.*;

public class Grade
{
	private int numGrade;

	public Grade()
	{
		numGrade = 0;
	}

	public Grade(int grade)
	{
		setGrade(grade);
	}

	public void setGrade(int grade)
	{
		numGrade= grade;
	}

	public String getLetterGrade( )
	{

		String letGrade = "";

		if(numGrade >= 90)
			letGrade = "A";
		else if (numGrade < 90 && numGrade >= 80)
			letGrade = "B";
		else if (numGrade < 80 && numGrade >= 70)
			letGrade = "C";
		else if (numGrade < 70 && numGrade >= 60)
			letGrade = "F";
		else
			letGrade = "F";

		return letGrade;
	}

	public String toString()
	{
		getLetterGrade();
		return numGrade + " is a " + getLetterGrade();
	}
}
