package Recursion;

public class SumOfDigit {
    public static int SumDigit(int n) {
        if(n<=0){
            return 0;
        }
        return n%10+SumDigit(n/10);

    }

    public static void main(String[] args) {
        System.out.println("Ans is:"+SumDigit(4567));

    }

}
