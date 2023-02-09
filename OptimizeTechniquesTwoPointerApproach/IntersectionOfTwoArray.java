package OptimizeTechniquesTwoPointerApproach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfTwoArray {

    public static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0, j = 0, k = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j])
                i++;
            else if (nums1[i] > nums2[j])
                j++;
            else {
                nums1[k++] = nums1[i];
                ++i;
                ++j;
            }
        }

        int ans[] = new int[k];
        for (i = 0; i < k; i++) {
            ans[i] = nums1[i];
        }
        return ans;
    }

    public static List<Integer> targetIndices(int[] nums, int target) {

        List<Integer> list = new ArrayList();

        int count = 0;
        int pos = 0;
        // declare variables for target number count
        // and 'sorted' position of target number

        for (int i : nums) {
            if (i == target)
                count++;
            // if number in nums is target number, add to count
            if (i < target)
                pos++;
            // if the number is smaller than target, if sorted, would
            // be placed before target number so by counting these
            // we will know where the target number(s) would start appearing
        }

        for (int i = 0; i < count; i++) {
            list.add(pos + i);
            // for loop to calculate the indexes, the pos is incremented for
            // each instance of the target number to create the answer
        }

        return list;

    }

    public boolean search(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target)
                return true;
            else if (nums[mid] > nums[start]) {
                if (target >= nums[start] && target < nums[mid])
                    end = mid - 1;
                else
                    start = mid + 1;
            } else if (nums[mid] < nums[start]) {
                if (target <= nums[end] && target > nums[mid])
                    start = mid + 1;
                else
                    end = mid - 1;
            } else {
                start += 1;
            }
        }
        return false;
    }
    public static boolean check(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            System.out.println("index:"+(i+1)%nums.length);
            if(nums[i]>nums[(i+1)%nums.length])
                 count++;
        }
        return (count<=1);
    }

    public static boolean checkString(String s) {
        boolean result=true;
        for(int i=0;i<s.length()-1;i++){
            System.out.println("String:"+s.substring(i,i+2));
            if((String)s.substring(i,i+2)=="ba"){
                result=false;
                break;
            }
        }
        return result;
    }

    
    public static void main(String args[]) {
        int[] nums1 = { 1, 2, 2, 1 };
        int[] nums2 = { 2, 2 };
        int[] nums3 = { 1, 2, 5, 2, 3 };
        int[] ans = intersect(nums1, nums2);
        for (int x : ans)
            System.out.print(x + " ");

        System.out.println("Ans is:" + targetIndices(nums3, 2));

        int[] arr = new int[nums3.length];
        for (int i = 0; i < nums3.length; i++) {
            arr[i] = nums3[i];
        }

        // arr=nums3;

        
        System.out.println("clone array:" + Arrays.toString(arr));
        System.out.println(5%6);
        int[] array={2,1,3,4};
        String name="helo";
        System.out.println(name.substring(0, 2));
        System.out.println("Ans is:"+check(array));
        System.out.println("ans string:"+checkString("abab"));
        System.out.println("ba"=="ba");
        
    }
}