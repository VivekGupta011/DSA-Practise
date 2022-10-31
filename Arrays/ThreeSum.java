package Arrays;

import java.util.Arrays;

public class ThreeSum {

    // Brute Force approach
    public static void main(String[] args) {
        int[] nums={-1,0,1,2,-1,-4};
        int[] arrans=ThreeSumCheck(nums);
        System.out.println("Ans:"+Arrays.toString(arrans));
    }
    
    public static int[] ThreeSumCheck(int[] nums){
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]+nums[j+1]==0){
                    return new int[]{nums[i],nums[j],nums[j+1]};
                }
            }
        }
        return nums;

    }
}
