package Strings;

public class ReversedString {

    public static void reverseString(char[] s) {
        String str = "";
        int index = s.length - 1;

        for (int i = 0; i < s.length/2; i++) {
            // System.out.print(index+" ");
            char temp = s[i];
            s[i] = s[index];
            s[index] = temp;
            index--;

        }
        // printing reverded string
        for (char c : s) {
            System.out.print(c + " ");
        }

    }

    public static void main(String[] args) {
        char[] arr = { 'h', 'e', 'l', 'l', 'o' };
       
        reverseString(arr);
    }

}
