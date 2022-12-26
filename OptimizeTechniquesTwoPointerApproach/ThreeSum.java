package OptimizeTechniquesTwoPointerApproach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.*;

public class ThreeSum {

    public static List<List<Integer>> threeSum(int[] nums) {

        // corner case
        if(nums.length<3) return new ArrayList<>();
        // sort array
        Arrays.sort(nums);
        // creating Hashset for storing array
        HashSet<List<Integer>> set = new HashSet<>();

        for(int i=0;i<nums.length-2;i++){
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                // if result equal to target value
                if(sum==0) set.add(Arrays.asList(nums[i], nums[j++], nums[k--]));
                else if(sum<0) j++;
                else if(sum>0) k--; 
            }
        }

        return new ArrayList<>(set);
        
    }

    public static void main(String[] args) {
        int[] array={-1,0,1,2,-1,-4};
        System.out.println("Ans is:"+threeSum(array));

        
    }
    
}
