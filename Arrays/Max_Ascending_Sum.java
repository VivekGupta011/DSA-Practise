package Arrays;

public class Max_Ascending_Sum {

    public static int maxAscendingSum(int[] nums) {
        int res=Integer.MIN_VALUE;
        int sum=nums[0];

        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                sum+=nums[i];
            }else{
                res=Math.max(sum, res);
                sum=nums[i];
            }
        }

        // updating max value
        res=Math.max(res, sum);
        return res;
    }
    public static void main(String[] args) {

        int[] arr={10,20,30,5,10,50};
        System.out.println("Ans is:"+maxAscendingSum(arr));
        
    }
    
}
