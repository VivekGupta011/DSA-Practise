package BinarySearch;

public class FindPeakElementLeetcodeOptimized {

    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if(arr[mid]>arr[mid+1]){
                end = mid;
            }else if (arr[mid]<arr[mid+1]){
                start = mid+1;
            }
        }
        return start;
        
    }
    public static void main(String[] args) {
        PeakIndexInMountainArrayLeetcodeAdityaVarma obj=new PeakIndexInMountainArrayLeetcodeAdityaVarma();
        int[] arr={5,10,20,15,2,23,90,67};
        System.out.println("Ans is:"+obj.peakIndexInMountainArray(arr));
        
    }
    
}
