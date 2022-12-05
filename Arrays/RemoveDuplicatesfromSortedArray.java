package Arrays;

public class RemoveDuplicatesfromSortedArray {
    public static int removeDuplicates(int[] nums) {
        int[] array2=new int[nums.length];
        int count=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1]){
                 array2[count]=count;
                 count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] array={0,0,1,1,1,2,2,3,3,4};
        System.out.println("Ans is:"+removeDuplicates(array));
    }
    
}
