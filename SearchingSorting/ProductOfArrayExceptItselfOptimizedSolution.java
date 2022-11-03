package SearchingSorting;

import java.util.Arrays;

public class ProductOfArrayExceptItselfOptimizedSolution {
    public static void main(String[] args) {
        int[] array={4,2,1,7};
        System.out.println("Ans is:"+Arrays.toString(FindproductExceptSelf(array)));
    }
    public static int[] FindproductExceptSelf(int[] nums){
        int len=nums.length;

        // int array
        int[] left=new int[len]; 
        int[] right=new int[len]; 
        int[] result=new int[len];
        
        // left array
        left[0]=1;
        for(int i=1;i<nums.length;i++){
            left[i]=left[i-1]*nums[i-1];
        }

        // right array
        right[len-1]=1;
        for(int i=nums.length-2;i>=0;i--){
            right[i]=right[i+1]*nums[i+1];
        }
         
        // result array
        for(int i=0;i<nums.length;i++){
            result[i]=left[i]*right[i];

        }


       return result;

    }
    
}
