package Arrays;

public class FibonacciSeries {
    public static int fib(int n) {
        int first=0;
        int second=1;
        int last=0;

        // corner case
        if(n==1){
            return 1;
        }
        for(int i=1;i<n;i++){
            last=first+second;
            first=second;
            second=last;
        }
        return last;
        
    }

    public static void main(String[] args) {
        System.out.println("Ans is:"+fib(5));
    }
}
