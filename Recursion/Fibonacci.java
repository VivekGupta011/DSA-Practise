package Recursion;

public class Fibonacci {
    public static void main(String[] args) {
        int a=0,b=1;
        System.out.println(a);
        System.out.println(b);
        int n=2;
        SeriesFibonacci(a, b, n);
    }
    public static void SeriesFibonacci(int a,int b,int n){
        if(n==8){
            System.out.print("last"+n);
            return;
        }
        int c=a+b;
        System.out.println(c);
        SeriesFibonacci(b, c, n+1);
        // System.out.println("n:"+(n-1));

    }
    
}
