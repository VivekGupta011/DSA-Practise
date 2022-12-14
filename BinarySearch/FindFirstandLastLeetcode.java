package BinarySearch;

import java.util.Arrays;
public class FindFirstandLastLeetcode {
    public static int[] searchRange(int[] nums, int target) {
        int index=0;
        int[] result=new int[2];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                result[index]=i;
                index++;
                if(nums[i+1]==target){
                    result[index]=i+1;

                }

            }
        }
        // adding corner case
        int len=result[0];
        int inddex=0;
        if(len==0 || nums.length==0){
            result[inddex]=-1;
            inddex++;
            if(result[1]==0){
                result[inddex]=-1;

            }
        }
        System.out.println("ans is:"+len);
        return result;
    }

    public static void main(String[] args) {
        int[] array={};
        int target=81;
        // int[] ans=searchRange(array, target);
        // for(int c:ans){
        //     System.out.print(c+" ");
        // }
        System.out.println(Arrays.toString(searchRange(array, target)));
        
        
    }

}
