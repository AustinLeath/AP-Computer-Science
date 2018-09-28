class Triangle {
  private int sideA, sideB, sideC;

  public Triangle(int a, int b, int c) {
    sideA = a;
    sideB = b;
    sideC = c;
  }
  public Triangle() {
    sideA = 0;
    sideB = 0;
    sideC = 0;
  }
  public String toString() {
    return sideA + " " + sideB + " " + sideC;
  }
}
