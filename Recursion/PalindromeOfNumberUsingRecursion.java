package Recursion;

public class PalindromeOfNumberUsingRecursion {
    public static int PalindromeChecker(int num,int temp){

        //base condition
        if(num==0){
            return temp;
        }

        temp=(temp*10)+num%10;
        return PalindromeChecker(num/10, temp);



    }
    public static void main(String[] args) {
        int num=75517;
        System.out.println("original:"+num);
        if(PalindromeChecker(num, 0)==num){
            System.out.println("Palindrome:"+PalindromeChecker(num, 0));
            
        }else{
            System.out.println("Palindrome Not:"+PalindromeChecker(num, 0));

        }
    }
    
}
