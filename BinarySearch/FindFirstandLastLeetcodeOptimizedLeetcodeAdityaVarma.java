package BinarySearch;

import java.util.Arrays;

public class FindFirstandLastLeetcodeOptimizedLeetcodeAdityaVarma {
    public static int[] searchRange(int[] nums, int target) {
        int[] result = { -1, -1 };
        int res1 = -1;
        int res2 = -1;
        // for first occurance
        int start1 = 0;
        int end1 = nums.length - 1;
        while (start1 <= end1) {
            int mid1 = start1 + (end1 - start1) / 2;
            if (nums[mid1] > target) {
                end1 = mid1 - 1;
            } else if (nums[mid1] < target) {
                start1 = mid1 + 1;
            } else {
                res1 = mid1;
                end1 = mid1 - 1;
            }

        }
        result[0] = res1;
        System.out.println("ll:"+result[0]);
        
        // for last occurance
        // for first occurance
        int start2 = 0;
        int end2 = nums.length - 1;
        while (start2 <= end2) {
            int mid2 = start2 + (end2 - start2) / 2;
            if (nums[mid2] > target) {
                end2 = mid2 - 1;
            } else if (nums[mid2] < target) {
                start2 = mid2 + 1;
            } else {
                res2 = mid2;
                start2 = mid2 + 1;
            }
            
        }
        result[1] = res2;
        System.out.println("lll:"+result[1]);
        
        return result;
    }
    
    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 2, 2, 3, 4, 7, 8, 8 };
        int target = 8;
        System.out.println("Ans is:" + Arrays.toString(searchRange(arr, target)));

    }

}
 