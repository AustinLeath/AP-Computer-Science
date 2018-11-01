public class Checker
{
  private int one, two;
  public Checker(int n1, int n2)
  {
    setNums(n1, n2);
  }
  public void setNums(int n1, int n2)
  {
   one = n1;
   two = n2;
  }
  public boolean compare() {
    if(one == two) {
      return true;
    } else {
      return false;
    }
  }
  public String toString() {
    if(compare()) {
      return one + " and " + two + " are equal";
    } else {
      return one + " and " + two + " are not equal";
    }
  }
}
