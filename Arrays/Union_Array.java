package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Union_Array {

    // Two pointer approach

    public static void Union_of_array(int[] nums1, int[] nums2) {
        int start1 = 0;
        int start2 = 0;
         ArrayList<Integer> list=new ArrayList<>(5);
        while (start1 < nums1.length && start2 < nums2.length) {
            if (nums1[start1] < nums2[start2]) {
                list.add(nums1[start1]);
                // System.out.print(nums1[start1]+" ");
                start1++;

            }else if(nums1[start1]>nums2[start2]){
                list.add(nums2[start2]);
                // System.out.print(nums2[start2]+" ");
                start2++;
            }else{
                list.add(nums1[start1]);
                // System.out.print(nums1[start1]+" ");
                start1++;
                start2++;
            }
        }

        // adding remaining element in array list
        while(start1<nums1.length){
            list.add(nums1[start1]);
            start1++;
        }
        while(start2<nums2.length){
            list.add(nums2[start2]);
            start2++;
        }
        

        // printing all arraylist
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }

    }

    public static void main(String[] args) {
        int arr1[] = { 1, 2, 4, 5, 6 };
        int arr2[] = { 2, 3, 5, 7 };
        Union_of_array(arr1, arr2);
        

    }

}
