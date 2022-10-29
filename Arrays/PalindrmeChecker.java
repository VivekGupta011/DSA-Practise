package Arrays;
import java.util.Arrays;
public class PalindrmeChecker {
    public static void main(String[] args) {
        int intnum=-3553;
        boolean ans= PalindromeChecker(intnum);
        System.out.println("Ans:"+ans);
      
    }

    public static boolean PalindromeChecker(int x){
        //storing original value
        int OriginalNum=x;
        int reversedNum=0;
        int remiander;

        //reverse originalNum and store in variable
        while(x!=0){
            remiander=x%10;
            reversedNum=reversedNum*10+remiander; 
            x /= 10;


        }

        // check Palindrome
        if(OriginalNum==reversedNum && OriginalNum >=0){
            return true;
        }

        
        return false;


    }
    
}
