package Arrays;


public class Contains_Duplicate_III_Brute_Force {

    public static boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(Math.abs(nums[i]-nums[j])<=valueDiff && Math.abs(i-j)<=indexDiff && i!=j){
                    return true; 
                }
            }
        }
        return false;
        
    }

    public static void main(String[] args) {
        int[] array={1,5,9,1,5,9};
        System.out.println(containsNearbyAlmostDuplicate(array, 2, 3));
        
    }
    
}
