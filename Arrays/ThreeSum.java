package Arrays;

import java.util.Arrays;

public class ThreeSum {

    // Brute Force approach
    public static void main(String[] args) {
        int[] nums={-1,0,1,2,8,4};
        int[] arrans=ThreeSumCheck(nums);
        System.out.println("Ans:"+Arrays.toString(arrans));
    }
    
    public static int[] ThreeSumCheck(int[] nums){
        for(int i=0;i<nums.length-2;i++){
            System.out.println("i:"+i);
            for(int j=i+1;j<nums.length-2;j++){
                if(nums[i]+nums[j]+nums[j+1]==14){
                    return new int[]{nums[i],nums[j],nums[j+1]};
                }
            }
        }
        return nums;

    }
}
