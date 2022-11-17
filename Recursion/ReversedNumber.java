package Recursion;

public class ReversedNumber {

    public static String ReversedNum(int num){
        String Reversed="";
        if (num == 0) {
            return "";
        }
        return (Reversed+num%10)+ReversedNum(num/10);
    }
    public static void main(String[] args) {
        System.out.println("Ans is:"+ReversedNum(56980099));
        
    }
    
}
