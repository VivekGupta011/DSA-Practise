package BinarySearch;

public class NearlySortedArray {

    public static int NearlySortedElement(int[] array,int target){

        int start=0;
        int last=array.length-1;
        while(start<last){
            int mid=start+(last-start)/2;
            if(array[mid]==target){
                return mid;
            }
            if(mid>start && array[mid-1]==target){
                return mid-1;
            }
            if(mid<last && array[mid+1]==target){
                return mid+1;
            }
            if(array[mid]>target){
                last=mid-2;
            }
            if(array[mid]<target){
                start=mid+2;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int[] array={3,2,10,4,40};
        int target=4 ;
        System.out.println("Ans is:"+NearlySortedElement(array,target));
    }
    
}
