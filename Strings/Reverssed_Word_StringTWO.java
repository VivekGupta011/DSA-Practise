package Strings;

public class Reverssed_Word_StringTWO {
    /**
     * @param s
     */
    public static String reverseWords(String s) {
        int start = 0;
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ' ') {
                reverse(start, i - 1, arr);
                start = i + 1;
            } else if (i == arr.length - 1) {
                reverse(start, i, arr);
            }
        }
        return new String(arr);

    }

    public static void reverse(int start, int last, char[] arr) {
        while (start < last) {
            char temp = arr[start];
            arr[start] = arr[last];
            arr[last] = temp;
            start++;
            last--;
        }
    }

    public static void main(String[] args) {
        // reverseWords("Let's take LeetCode contest");
        String str = "Let's take LeetCode contest";
        System.out.println("Ans is:"+reverseWords(str));

    }
}