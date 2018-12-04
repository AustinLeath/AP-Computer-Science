import static java.lang.System.*;

public class TenToAny {
	private int base10;
	private int newBase;

   public void TenToAny() {
      setNum(a,b);
   }

	public int setNum(int a, int b) {
		int num = 0;
		return num;
	}

	public String getNewNum() {
		int a = base10;
		int b = newBase;
		String newNum = "";
		String blank = "";

		while (a > 0) {
			newNum += ("" + a % b);
			a = a / 8;
		}
		int c = newNum.length();
		String temp = newNum;

		while (c > 0) {
			blank += temp.substring(c - 1, c);
			newNum = blank;
			c--;
		}
		return newNum;
	}

	public String toString() {
		String print = "";
		print = (base10 + " base 10 is " + getNewNum() + " base " + newBase);
		return print;
	}
}
