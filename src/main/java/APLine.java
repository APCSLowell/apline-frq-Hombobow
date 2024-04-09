public class APLine
{
  /* your code here */
  int A;
  int B;
  int C;
  public APLine(int a, int b, int c) {
    int A = a;
    int B = b;
    int C = c;
  }
  public double getSlope() {
    return ((double) -a) / ((double) b);
  }
  public boolean isOnLine(int x, int y) {
    if (A(x) + B(y) + C == 0) {
      return true;
    }
    return false;
  }
}
