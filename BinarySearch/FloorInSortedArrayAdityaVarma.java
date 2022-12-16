package BinarySearch;

import java.security.interfaces.RSAKey;

public class FloorInSortedArrayAdityaVarma {
    public static int FloorNumber(int[] array,int target){
        int start=0;
        int last=array.length-1;
        int floor=-1;
        
        while(start<=last){
            int mid=(start+last)/2;

            if(array[mid]==target){
                return mid;
            }
            if(array[mid]>target){
                last=mid-1;
            }
            if(array[mid]<target){
                floor=mid;
                start=mid+1;
            }
        }
        return floor;

    }

    public static int CeilNumber(int[] array,int target){
        int start=0;
        int last=array.length-1;
        int ceil=-1;
        
        while(start<=last){
            int mid=(start+last)/2;

            if(array[mid]==target){
                return mid;
            }
            if(array[mid]>target){
                last=mid-1;
                ceil=mid;
            }
            if(array[mid]<target){
                
                start=mid+1;
            }
        }
        return ceil;

    }
    public static void main(String[] args) {
        int[] array={1,2,8,10,10,12,19};
        int target=45;
        System.out.println("Ans is:"+FloorNumber(array, target));
        System.out.println("Ans is:"+CeilNumber(array, target));
    }
    
}
