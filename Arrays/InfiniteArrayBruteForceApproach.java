package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class InfiniteArrayBruteForceApproach {

    public static int CheckInfinite(int[] array, int target) {

        int i = 0;
        while (array[i] <= target) {
            if (array[i] == target) {
                return i;
            } else {
                i = i + 1;
            }

        }
        return -1;

    }

    public static int[] sortEvenOdd(int[] nums) {

        int[] array = new int[nums.length];

        ArrayList<Integer> OddList = new ArrayList<>();
        ArrayList<Integer> EvenList = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (i != 0 && i % 2 != 0) {
                OddList.add(nums[i]);
            }
            if (i % 2 == 0) {
                EvenList.add(nums[i]);
            }
        }

        // Sort the values at odd indices of nums in non-increasing order.
        Collections.sort(OddList, Collections.reverseOrder());
        System.out.println("oddList:" + OddList);

        // Sort the values at even indices of nums in non-decreasing order.
        Collections.sort(EvenList);
        System.out.println("EvenList:" + EvenList.get(0));

        // setting value
        int index = 0;
        int index1 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i != 0 && i % 2 != 0) {
                array[i] = OddList.get(index);
                index++;
            }
            if (i % 2 == 0) {
                array[i] = EvenList.get(index1);
                index1++;
            }
        }

        return array;

    }

    public static int findTheDifference(String s, String t) {
        // Stack<Character> st= new Stack<>();
        // //if(s.length()>0){ st.push(s.charAt(0));}

        // int j=0;
        // for(int i=0; i<s.length(); i++){

        // st.push(s.charAt(i));
        // System.out.println(st.peek());
        // while(st.size()>0 && st.peek()==t.charAt(j)){
        // st.pop();
        // j++;

        // }

        // }
        // System.out.println(j);
        // System.out.println(t.charAt(j));
        // if(j==t.length()-1){
        // System.out.println(t.charAt(j));
        // return t.charAt(j);
        // }
        // return ' ';

        int sum = 0;
        for (int i = 0; i < t.length(); i++) {
            sum += t.charAt(i);
        }
        System.out.println("sum:"+sum);
        for (int i = 0; i < s.length(); i++) {
            sum -= s.charAt(i);
            System.out.println("sum is:"+sum);
        }

        return  sum;

    }

    public static void main(String[] args) {
        int[] array = { 1, 3, 5, 8, 12, 15, 17, 18, 20, 28, 30, 140, 2020 };
        System.out.println("Ans is:" + CheckInfinite(array, 18));
        int[] arr = { 4, 1, 2, 3 };
        System.out.println("Ans is:" + Arrays.toString(sortEvenOdd(arr)));
        System.out.println("ans is:"+findTheDifference("abcd","abcde"));

    }

}
