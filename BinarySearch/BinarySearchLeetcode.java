package BinarySearch;

public class BinarySearchLeetcode {
    public int search(int[] nums, int target) { 

        int first = 0;
        int last = nums.length - 1;
        while (first <= last) {
            // for mid value
            int mid = first + (last - first) / 2;

            // check if x is present at mid
            if (nums[mid] == target) {
                return mid;
            }

            // if target greter
            if (nums[mid] < target) {
                first = mid + 1;

            }

            // if x is smaller than target
            else {
                last = mid - 1;
            }
        }
        // if no element here than return -1
        return -1;

    }

    public static void main(String[] args) {
        BinarySearchLeetcode obj=new BinarySearchLeetcode();
        int nums[] = {2,3,4,10,40};
        System.out.println("Element index is:"+obj.search(nums, 400));
    }

}
