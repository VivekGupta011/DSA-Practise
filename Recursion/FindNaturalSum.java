package Recursion;

public class FindNaturalSum {
    public static void main(String[] args) {
        RecursionTest(1, 6, 0);
        
    }
    public static void RecursionTest(int i,int n,int sum){
        if(i==n){
            sum+=i;
            System.out.println("Sum:"+sum);
            return;
        }
        sum+=i;
        System.out.println("i:"+i);
        RecursionTest(i=i+1, n, sum);

    }
    
}
