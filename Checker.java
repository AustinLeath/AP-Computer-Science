public class Checker {
  private int one,two;

  public Checker(int n1, int n2) {

  }

  public void setNums(int n1,int n2) {

    numberOne = n1;
		numberTwo = n2;

  }

  public boolean compare() {
    if(numberOne == numberTwo) {
      return true;
    } else {
      return false;
    }
  }

  public String toString() {
    if(compare = true) {
      return numberOne + " and " + numberTwo + " are equal";
    } else {
      return numberOne + " and " + numberTwo + " are not equal";
    }
  }
}
