package OptimizeTechniquesTwoPointerApproach;

public class SumOfSquareNumbers {
    public static boolean judgeSquareSum(int c) {
        if (c == 1) {
            return true;
        }
        long low = 0;
        long high = (long) Math.sqrt(c);

        while (low <= high) {
            long sum = low * low + high * high;
            if (sum == c) {
                return true;
            }
            if (sum < c) {
                low++;
            } else {
                high--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println("ans is:"+judgeSquareSum(5));
    }
}
