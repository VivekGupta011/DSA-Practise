package OptimizeTechniquesTwoPointerApproach;

import java.util.Arrays;

public class ThreeSumCloset {
    public static int threeSumCloset(int[] nums,int target){
        int min=Integer.MAX_VALUE;
        int result=0;
        // sort array
        Arrays.sort(nums);

        // using two pointer approach
        for(int i=0;i<nums.length;i++){
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                int diff=Math.abs(sum-target);
                // if result found
                if(diff==0) return sum;
                // storing closet 3sum 
                if(diff<min){
                    min=diff;
                    result=sum;
                }
                // increment and decrement for two pointer approach
                if(sum<=target){
                    j++;
                }else{
                    k--;
                }
                
            }
        }
        return result;
    }


    public static void main(String[] args) {
        int[] arr={0,0,0};
       System.out.println("Ans is:"+ threeSumCloset(arr, 1));
        
    }
    
}
