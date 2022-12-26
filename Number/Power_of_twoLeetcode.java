package Number;

public class Power_of_twoLeetcode {
    public static boolean isPowerOfTwo(int n) {
        if (n == 1) {
            return true;
        }
        int power = 2;
        int powerNum = 0;
        int result;
        while (n >= power) {
            result = (int) Math.pow(power, powerNum);
            if (n == result) {
                return true;
            }
            powerNum++;
        }
        return false;

    }

    public static void main(String[] args) {
        // System.out.println("Ans is:" + isPowerOfTwo(8));
        System.out.println(8345/10);

    }

}
