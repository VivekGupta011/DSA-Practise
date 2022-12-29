package Sliding_Window;

public class Subarray_Sum_Equals_K {
    public static int subarraySum(int[] nums, int k) {
        // check subarray count 
        int count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                if(nums[i]+nums[j]==k){
                    System.out.println(i+"  "+j);
                    count++;
                }
                if(nums[i]==k){
                    System.out.println(i+"i");
                    count++;
                }
            }
        }
        return count;
        
    }

    public static void main(String[] args) {
        int[] arr={1,1,1};
       System.out.println("Ans is:"+ subarraySum(arr, 2));
    }
    
}
