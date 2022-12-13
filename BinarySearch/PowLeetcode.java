package BinarySearch;

public class PowLeetcode {
    public static double myPow(double x, int n) {
        double result=1;
        // converting x for negative power value
        if(n<0){
            x=1/x;
            n*=-1;
        }
        for(int i=0;i<n;i++){
            result*=x;

        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Ans is:"+myPow(2.10000, 3));
    }

    
}
