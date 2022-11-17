package Recursion;

public class Fundamental {
    public static void main(String[] args) {
        main(1);
        GetRecursion(1);
    }

    static void main(int num){
        System.out.println(num);
        main1(2);
        
    }
    static void main1(int num){
        System.out.println(num);
        main2(3);
        
    }
    static void main2(int num){
        System.out.println(num);
        main3(4);
        
    }
    static void main3(int num){
        System.out.println(num);
        // main1(1900);

    }

    // Recursion Creation
    static void GetRecursion(int n){
        int a=0;
        int b=1;
        int c=a+b;
        System.out.print(a+","+b+","+c);
        for(int i=0;i<7-2;i++){
            a=b;
            b=c;
            c=a+b;
            System.out.print(","+c);

        }
    }
    
}
