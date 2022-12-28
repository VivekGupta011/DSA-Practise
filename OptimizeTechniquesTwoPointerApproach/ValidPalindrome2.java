package OptimizeTechniquesTwoPointerApproach;

public class ValidPalindrome2 {
    public static boolean validPalindrome(String s) {

        int start = 0;
        int last = s.length() - 1;
        int count1 = 0, count2 = 0;

        // from left side
        while (start < last) {
            if (s.charAt(start) == s.charAt(last)) {
                start++;
                last--;
            } else {
                start++;
                count1++;
            }
        }

        
        start = 0;
        last = s.length() - 1;

        // from right side
        while (start < last) {
            if (s.charAt(start) == s.charAt(last)) {
                start++;
                last--;
            } else {
                last--;
                count2++;
            }
        }

        // checking palindrome after delete first element
        if (count1 == 1 || count2 == 1)
            return true;
        if (count1 == 0 || count2 == 0)
            return true;

      return false;
    }

    public static void main(String[] args) {
      String str="aba";
      System.out.println("Ans is:"+validPalindrome(str));
    }
}
