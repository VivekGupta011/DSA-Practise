package Recursion;

public class Palindrome {

    public static boolean PalindromeChecker(String word) {
        int start = 0;
        int end = word.length() - 1;
        boolean CheckPalindrome = true;
        while (start < end) {
            if (word.charAt(start) != word.charAt(end)) {
                CheckPalindrome = false;
            }
            start++;
            end--;
        }

        return CheckPalindrome;

    }

    public static void main(String[] args) {
        System.out.println("Ans is:" + PalindromeChecker("abguba"));

    }

}
