package Arrays;

import java.util.HashMap;

public class Contains_Duplicate_II_Optimize {

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> list=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(list.containsKey(nums[i])){
                int temp=list.get(nums[i]);
                if(i-temp<=k){
                    return true;
                }
            }else{
                list.put(nums[i], i);
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int[] arr = { 1,2,3,1 };
        System.out.println(containsNearbyDuplicate(arr, 3));
        
    }
    
}
