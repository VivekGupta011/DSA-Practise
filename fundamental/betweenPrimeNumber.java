package fundamental;

import java.util.Scanner;

public class betweenPrimeNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter first number Number:");
        int firstNumber=scn.nextInt();
        System.out.println("Enter second number Number:");
        int secondNumber=scn.nextInt();

        int init;
        int prime[]=new int[10];
        int primeNot[]=new int[10];
        for(init=firstNumber;init<=secondNumber;init++){
            for(int initial=1;initial<firstNumber;initial++){
                if(firstNumber%initial==0){
                    primeNot[initial]=firstNumber;
                    
                }else{
                    prime[initial]=firstNumber;

                }
            }
        }

        System.out.println("prime:"+prime);
        System.out.println("prime not:"+primeNot);

         

    }

}
