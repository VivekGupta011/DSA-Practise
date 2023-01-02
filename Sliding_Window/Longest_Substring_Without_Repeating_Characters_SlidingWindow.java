package Sliding_Window;

import java.util.HashMap;

public class Longest_Substring_Without_Repeating_Characters_SlidingWindow {

    public static int lengthOfLongestSubstring(String s) {

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int start = 0;
        int SubString_Size = 0;

        // Traversing all element in for loop
        for (int end = 0; end < s.length(); end++) {
            char c = s.charAt(end);

            // Check element contain or not
            if (map.containsKey(c)) {
                if (start <= map.get(c)) {
                    start = map.get(c) + 1;
                }
            }

            SubString_Size = Math.max(SubString_Size, end - start + 1);
            map.put(c, end);

        }
        return SubString_Size;

    }

    public static void main(String[] args) {

        String s = "bbbbb";
        System.out.println(lengthOfLongestSubstring(s));
        float n=7;
        System.out.println(n/2);

    }

}
