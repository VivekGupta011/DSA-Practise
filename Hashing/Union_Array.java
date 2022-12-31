package Hashing;

import java.util.HashSet;
import java.util.Iterator;

public class Union_Array {

    public static void UnionArray(int[] nums1,int[] nums2){
        HashSet<Integer> list=new HashSet<>();

        // for first array
        for(int i=0;i<nums1.length;i++){
            list.add(nums1[i]);
        }

        // for second array
        for(int i=0;i<nums2.length;i++){
            list.add(nums2[i]);
        }

        // printing Hashset value
        // Iterating over hashset items
        Iterator<Integer> i=list.iterator();
        while(i.hasNext()){
            System.out.print(i.next()+" ");
        }

    }

    public static void main(String[] args) {
        int arr1[] = { 1, 2, 4, 5, 6 };
        int arr2[] = { 2, 3, 5, 7 };
        UnionArray(arr1, arr2);

    }

}
