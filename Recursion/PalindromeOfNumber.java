package Recursion;

import javafx.scene.effect.Light.Spot;

public class PalindromeOfNumber {
    public static void PalindromeChecker(int num){
        int reversedNum=0;
        int Original=num;
        int remainder;
        while(num>0){
            remainder=num%10;
            reversedNum=reversedNum*10+remainder;
            num=num/10;

        }
        if(Original==reversedNum){
            System.out.println("palindrome:"+reversedNum);
        }else{
            System.out.println(" Not palindrome");

        }
        
    }
    public static void main(String[] args) {
        PalindromeChecker(7997);
       
        
    }
    
}
