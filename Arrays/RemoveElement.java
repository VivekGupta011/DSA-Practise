package Arrays;

import java.util.Arrays;

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int count=0;
        for(int i=0;i<nums.length;i++){
        
            if(nums[i]==val){
                continue;
            }
            if(nums[i]!=val){ 
                nums[count++]=nums[i];
            }
        }
        for(int c:nums){
            System.out.print(c+" ");
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr={3,2,2,3};
        int val=2;
        System.out.println(++val);
        System.out.println("Ans is:"+removeElement(arr, val));
    }
    
}
