public class Sample {
  public final int NOCHANGE = 8;
  private int num1, product;
  private double num2;

  public Sample() {
    setvals(0,0,0);
  }
  public Sample(int n1, double n2) {
    setvals(n1,n2);
  }
  public void setVals() {
    num1 = n1;
    num2 = n2;
  }
  public int getNum1() {
    return num1;
  }
  public double getnum2() {
    return num2;
  }
  public double multiply(int n1, double n2) {
    product = n1 * n2;
    return product;
  }
}
