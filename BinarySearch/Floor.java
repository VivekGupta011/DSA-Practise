package BinarySearch;

public class Floor {
     // ceiling is return smallest number <= target
    public static void main(String[] args) {
        System.out.println("This  is testing!");
        int[] array={2,4,12,5,10,12,15};
        int target=11;
        Floor bb=new Floor();
        int ans=bb.binarySearch(array, target);
        System.out.println("This is array target:"+ans);    
    }

    public int binarySearch(int[] arr,int target){
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            //find middle element
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }else if(target>arr[mid]){
                start=mid+1;
            }else{
                return mid;
            }  
        }
        return end;
    }
}
