package OptimizeTechniquesTwoPointerApproach;

import java.util.Arrays;
// Two pointer technique use for searching pairs in a sorted array.
// e.q.find if there pair of elements(A[i]+B[j]) such thier sum is equal to X.

public class TwoSum {
    public static int[] CheckSum(int[] arr, int N, int target) {
        int start = 0;
        int last = N - 1;
        while (start < last) {

            if (arr[start] + arr[last] == target) {
                return new int[]{start,last};
            } else if (arr[start] + arr[last] < target) {
                start++;
            } else {
                last--; 
            }
        }
        return arr;

    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 8, 9, 10, 11 };
        int val = 21;
        int N = arr.length;
        System.out.println("Ans is:"+Arrays.toString(CheckSum(arr, N, val)));
    }

}
