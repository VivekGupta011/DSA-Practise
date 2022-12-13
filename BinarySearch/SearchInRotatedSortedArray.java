package BinarySearch;

import java.util.Arrays;

public class SearchInRotatedSortedArray {
    public static int search(int[] nums, int target) {

        int len=nums.length;
        int first = 0;
        int last = len - 1;
        while (first <= last) {
            int mid = first + (last - first) / 2;

            if (nums[mid] == target) {
                return mid + 1;
            }

            // if target greter than middle
            if (nums[mid] < target) {
                first = mid + 1;
            }

            // if target smaller than middle
            else {
                last = mid - 1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {4};
        // sorting an array
        Arrays.sort(array);
        System.out.println("ans is:" + search(array, 70));

    }

}
