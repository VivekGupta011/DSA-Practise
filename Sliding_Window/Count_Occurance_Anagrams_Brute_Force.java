package Sliding_Window;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Count_Occurance_Anagrams_Brute_Force {


    // Function to find if two strings are equal
    static boolean AreAnagram(String s1, String s2) {
        // Converting strings to char arrays
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();

        // sorting both char arrays
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));

        // check for equality of strings
        if (Arrays.equals(ch1, ch2)) {
            return true;
        } else
            return false;
    }

    // for count
    static List<Integer> indAnagrams(String text, String word) {
        List<Integer> list = new ArrayList<Integer>();
        int N = text.length();
        int n = word.length();
        System.out.println("N:" + N);
        System.out.println("n:" + n);

        // initialize result
        int res = 0;
        for (int i = 0; i <= N - n; i++) {
            String s = text.substring(i, i + n);
            // Cheking
            if (AreAnagram(word, s)) {
                list.add(i);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println("Ans is:" + indAnagrams("cbaebabacd", "abc"));
    }

}
