package SearchingSorting;


import java.util.Arrays;

public class ProductOfArrayExceptItself {
    public static void main(String[] args) {
        int[] arr= {-1,1,0,-3,3};
        MultiplyChecker(arr);
        
    }
    public static void MultiplyChecker(int[] nums){
        int[] Multiply=new int[nums.length];
        int index=0;
        for(int i=0;i<nums.length;i++){
            int product=1;
            for(int j=0;j<nums.length;j++){
                if(i!=j){
                    product*=nums[j];
                    
                }
            }
            Multiply[index]=product;
            index++;
        }
        
        System.out.print("Ans is:"+Arrays.toString(Multiply));
    }
    
}
