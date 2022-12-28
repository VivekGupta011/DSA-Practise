package Arrays;

import java.util.Arrays;
import java.util.HashMap;

public class IntersectionTwoArrays2UsingHashing {

    public static int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> data=new HashMap<Integer,Integer>();
         
        // storing array information in hashmap
        for(int val:nums1){
            data.put(val, data.getOrDefault(val, 0)+1);
        }

        // checking frequency in hashamap
        int k=0;
        for(int val:nums2){
            if(data.getOrDefault(val,0)>0){
                nums1[k++]=val;
                data.put(val,data.get(val)-1);
            }
        }

        // storing all value in new array
        int[] ans=new int[k];
        for(int i=0;i<k;i++){
            ans[i]=nums1[i];
        }

        return ans;

    }

    public static void main(String[] args) {
        int[] nums1={1,2,2,1};
        int[] nums2={2,2};
        System.out.println("Ans is:"+Arrays.toString(intersect(nums1, nums2)));
    }

}
