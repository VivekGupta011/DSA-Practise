package OptimizeTechniquesTwoPointerApproach;

public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        String str="";
        // for storing string value only
        for(char c:s.toCharArray()){
            if(Character.isDigit(c) || Character.isLetter(c)){
                str=str+c;
            }
        }

        // for converting lowercase
        str=str.toLowerCase();
        int start=0;
        int last=str.length()-1;
        while(start<=last){
            if(str.charAt(start)!=str.charAt(last)){
                return false;
            }
            start++;
            last--;
        }
        return true;
    }

    public static void main(String[] args) {
        String PalindromeChecker="A man, a plan, a canal: Panama";
        System.out.println("Ans is:"+isPalindrome(PalindromeChecker));

    }

}
