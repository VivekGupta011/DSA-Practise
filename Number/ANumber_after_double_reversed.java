package Number;

public class ANumber_after_double_reversed {

    public static boolean isSameAfterReversals(int num) {
        int result = 0;
        int result2 = 0;
        int Original = num;
        System.out.println("original:"+Original);
        while (num > 0) {
            int reversedNum = num % 10;
            if (reversedNum != 0) {
                result = result * 10 + reversedNum;
            }
            num = num / 10;
        }
        System.out.println("ans is:" + result);
        // second reversed
        while (result > 0) {
            int reversedNum = result % 10;
            if (reversedNum != 0) {
                result2 = result2 * 10 + reversedNum;
            }
            result = result / 10;
        }

        System.out.println("Ans is:" + result2);

        if(Original==result2){
            return true;
        }else{
            return false;
        }

    }

    public static void main(String[] args) {
        System.out.println("Ans is:"+isSameAfterReversals(876086));
    }

}
