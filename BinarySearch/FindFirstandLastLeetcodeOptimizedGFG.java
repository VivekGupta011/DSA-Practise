package BinarySearch;

import java.util.Arrays;

public class FindFirstandLastLeetcodeOptimizedGFG {
    // public static int[] searchRange(int[] nums, int target) {

    // }
    // for the left side of first occurance
    static int first(int arr[], int target) {
        int low = 0;
        int high = arr.length - 1;
        int res = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] > target) {
                high = mid - 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                // move to the left half for first occurance
                res = mid;
                high = mid - 1;
            }
        }
        return res;

    }

    // for the right side of last occurance
    static int last(int arr[], int target) {
        int low = 0;
        int high = arr.length - 1;
        int res = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] > target) {
                high = mid - 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                // move to the left half for first occurance
                res = mid;
                low = mid + 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 2, 2, 3, 4, 7, 8, 8 };
        int x = 8;
        System.out.println("First Occurrence = "
                + first(arr, x));
        System.out.println("Last Occurrence = "
                + last(arr, x));
    }

}
