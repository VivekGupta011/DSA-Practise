package Sliding_Window;

public class Subarray_Sum_Equals_K_Brute_Force {

    // all test case not pass
    public static int subarraySum1(int[] nums, int k) {
        // check subarray count 
        int count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==k){
                    System.out.println(nums[i]+"  "+nums[j]);
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

    // using This Brute Force approach
    public static int subarraySum(int[] nums, int k) {
        
        int count=0; int sum=0;
        int n = nums.length;
        
        for(int i=0; i<n; i++){
            sum = nums[i];
            
            if(sum==k) count++;
            
            for(int j=i+1; j<n; j++){
                
                sum += nums[j];
                
                if(sum==k){
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
