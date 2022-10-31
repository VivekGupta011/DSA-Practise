package Strings;

public class ValidProblem {
    public static void main(String[] args) {
        String s="A man, a plan, a canal: Panama";
        System.out.println("Ans is:"+isPalindrome(s));
        
        
    }
    public static boolean isPalindrome(String s) {
        int start=0;
        int end=s.length()-1;
        while(start<end){
            while(start<end && !Character.isLetterOrDigit(s.charAt(start))) {
                start++;
            }
            while(start<end && !Character.isLetterOrDigit(s.charAt(end))) {
                end--;
            }

        if(Character.isLetterOrDigit(start)!=Character.isLetterOrDigit(end)){
            return false;
        }
        start++;
        end--;
        }

        return true;
        
    }
    
}
