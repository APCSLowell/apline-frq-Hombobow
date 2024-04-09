public class APLine
{
  /* your code here */
  private int A, B, C;
  public APLine(int a, int b, int c) {
    int A = a;
    int B = b;
    int C = c;
  }
  public double getSlope() {
    return ((double) -A) / ((double) B);
  }
  public boolean isOnLine(int x, int y) {
    if (A(x) + B(y) + C == 0) {
      return true;
    }
    return false;
  }
}
