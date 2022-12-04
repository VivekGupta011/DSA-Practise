package Stack;

import java.util.Arrays;

import fundamental.Array;

public class NextGreaterElementLeetcode {

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            boolean flag = false;
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j])
                    flag = true;
                if (flag == true && nums1[i] < nums2[j]) {
                    ans[i] = nums2[j];
                    flag = false;

                }
            }
            if (flag) {
                ans[i] = -1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums1 = { 4, 1, 2 };
        int[] nums2 = { 1, 3, 4, 2 };
        NextGreaterElementLeetcode obj = new NextGreaterElementLeetcode();
        int[] result = obj.nextGreaterElement(nums1, nums2);
        for (int c : result) {
            System.out.print(c + " ");
        }
    }

}
