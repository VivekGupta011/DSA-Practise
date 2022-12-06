package Arrays;

public class RemoveDuplicatesfromSortedArray {
    public static int removeDuplicates(int[] nums) {
       
        int k=1;
        int j=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1]){
                 nums[j]=nums[i+1];
                 j++;
            }
        }
        // for(int c:nums){
        //     System.out.print(c+" ");
        // }
        return j;
    }
    public static void main(String[] args) {
        int[] array={0,0,1,1,1,2,2,2,3,3,3,4};
        System.out.println("Ans is:"+removeDuplicates(array));
    }
    
}
