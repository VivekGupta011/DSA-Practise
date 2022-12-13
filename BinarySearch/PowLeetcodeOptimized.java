package BinarySearch;

public class PowLeetcodeOptimized {
    public static double myPow(double x, long n) {
        if (n == 0)
          return 1;
        if (n < 0)
          return 1 / myPow(x, -n);
        if (n % 2 == 1)
          return x * myPow(x, n - 1);
        return myPow(x * x, n / 2);
      }
public static void main(String[] args) {
    System.out.println("Ans is:"+myPow(5, 3));
}    
    
}
