package Arrays;

public class Contains_Duplicate_II_Brute {

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        boolean result = false;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    int diff = j - i;
                    if (diff <= k) {
                        result = true;
                        return result;
                    }
                }
            }
        }
        return result;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 1, 2, 3 };
        System.out.println(containsNearbyDuplicate(arr, 2));

    }

}
