package OptimizeTechniquesTwoPointerApproach;

public class Find_First_Palindromic_String_the_Array {

    public static String firstPalindrome(String[] words) {
        // for loop
        boolean PalindromeChecker;
        String result="";
        for(String c:words){
            int start=0;
            int last=c.length()-1;
            PalindromeChecker=true;
            while(start<=last){
                if(c.charAt(start)!=c.charAt(last)){
                    PalindromeChecker=false;

                }
                start++;
                last--;
            }
            // cheking palindrome or not
            if(PalindromeChecker){
                return c;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] str={"def","ghi"};
        System.out.println("Ans is:"+firstPalindrome(str));
    }
    
}
