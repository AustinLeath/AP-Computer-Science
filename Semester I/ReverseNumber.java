import static java.lang.System.*;

public class ReverseNumber
{
   private int number;

  public void setNumber(int num) {
    number = num;
  }

	public int getReverse() {
		int rev= 0;
		while(number > 0) {
      rev = rev * 10 + number % 10;
			number = number / 10;
    }
    return rev;
	}

  public String toString() {
    return number + " reversed is: " + getReverse();
  }
}
