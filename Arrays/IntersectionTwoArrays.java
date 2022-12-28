package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class IntersectionTwoArrays {

    // brute force approach time=O(n^2) space=O(n)
    public static int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int index = 0;

        if (nums1.length < nums2.length) {

            // first loop
            for (int i = 0; i < nums1.length; i++) {
                for (int j = 0; j < nums2.length; j++) {
                    if (nums1[i] == nums2[j]) {
                        list.add(nums1[i]);
                        break;
                    }
                }
            }

        }else{
            // first loop
            for (int i = 0; i < nums2.length; i++) {
                for (int j = 0; j < nums1.length; j++) {
                    if (nums1[j] == nums2[i]) {
                        list.add(nums1[j]);
                        break;
                    }
                }
            }
        }

        // converting arraylist to array
        int[] result = new int[list.size()];
        int k = 0;
        for (int i : list) {
            result[k] = i;
            k++;
        }

        return result;

    }

    // optimized solution
    public static int[] intersectionn(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<Integer>();
        for (int i : nums1) {
            set1.add(i);
        }
        HashSet<Integer> set2 = new HashSet<Integer>();
        for (int i : nums2) {
            if (set1.contains(i)) {
                set2.add(i);
            }
        }

        // adding all hashset value into array
        int[] result = new int[set2.size()];
        int index = 0;
        for (int i : set2) {
            result[index++] = i;
        }

        return result;

    }

    public static void main(String[] args) {
        int[] arr1 = { 4, 9, 5 };
        int[] arr2 = { 9, 4, 9, 8, 4 };
        System.out.println(Arrays.toString(intersection(arr1, arr2)));
        System.out.println(Arrays.toString(intersectionn(arr1, arr2)));
        // intersection(arr1, arr2);
    }

}
