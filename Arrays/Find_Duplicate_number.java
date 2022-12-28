package Arrays;

import java.util.HashMap;

public class Find_Duplicate_number {


    // First Approach
    // public static int findDuplicate(int[] nums) {
        
    //     int duplicate=-1;
    //     for(int i=0;i<nums.length;i++){
    //         for(int j=i+1;j<nums.length;j++){
    //             if(nums[i]==nums[j]){
    //                 duplicate=nums[j];
    //             }

    //         }
    //     }
    //     return duplicate;
        
    // }

    // Second approach
    // public static int findDuplicate(int[] nums) {
    //     int[] _nums = new int[nums.length];
    //     for (int i = 0; i < nums.length; i++) {
    //         if (_nums[nums[i]] != 0) {
    //             return nums[i];
    //         } else {
    //             _nums[nums[i]] = 1;
    //         }
    //     }
    //     return nums[0];

    // }


    // Third approach using Hashmap
    public static int findDuplicate(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i], 1);
            }else{
                return nums[i];
            }

        }
        return -1;

    }


    public static void main(String[] args) {
        int[] array={3,1,3,4,2,5,5};
        System.out.println("Ans is:"+findDuplicate(array));
    }
    
}
