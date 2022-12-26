package Arrays;

import java.util.Arrays;

public class MergedSortArray {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        // declare size of array
        int ArraySize=m+n;
        int[] arr=new int[ArraySize];
        int index=0;
        // adding second array data in first array
        for(int i=m;i<ArraySize;i++){
            nums1[i]=nums2[index];
            index++;
        }
    
        // sorting array
        Arrays.sort(arr);
        // printing merged array
        for(int c:nums1){
            System.out.print(c+" ");
        }


        
    }

    public static void main(String[] args) {
        int[] num1={1,2,3,0,0,0};
        int[] num2={2,5,6};
        merge(num1, 3, num2, 3);
        System.out.println(Math.pow(-2, 4));
        
    }
    
}
