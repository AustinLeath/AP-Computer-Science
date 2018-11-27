//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class ReverseNumber
{
   private int number;

	//add constructors <---- ???

  public Number(int number) {
		setNumber(number);
	}

  public void setNumber(int number) {
    num = number;
  }

	public int getReverse() {
		int rev= 0;
		while(number > 0) {
      rev = (rev*10+number);
    }
    return rev;
	}

  public String toString() {
    return "test " + number;
  }
}
