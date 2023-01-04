package Hashing;

import java.util.HashMap;
import java.util.HashSet;

public class Word_pattern {
    public static boolean wordPattern(String pattern, String s) {

        String[] arr = s.split(" ");
        if (arr.length != pattern.length())
            return false;
        HashMap<Character, String> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            char temp = pattern.charAt(i);
            if (map.containsKey(temp)) {
                if (!map.get(temp).equals(arr[i]))
                    return false;
            }

            // for leetcode testcase
            else if (set.contains(arr[i]))
                return false;
            else {
                set.add(arr[i]);
                map.put(temp, arr[i]);
            }
        }
        return true;

    }

    public static void main(String[] args) {
        String pattern = "aaaa", s = "dog cat cat dog";
        System.out.println("Ans is:" + wordPattern(pattern, s));

    }

}
