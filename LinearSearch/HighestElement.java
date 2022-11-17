package LinearSearch;

public class HighestElement {
    public static void main(String[] args) {
        int[] arr={0,10,5,2,3,4,5,4343,343,33334};
        HighestElement bb=new HighestElement();
        bb.peakIndexInMountainArray(arr);
        System.out.println(bb.peakIndexInMountainArray(arr));
    }
    public int peakIndexInMountainArray(int[] arr) {
        int highvalue=arr[0];
        int ans=-1;
        for(int i=1;i<arr.length;i++){
            if(highvalue<arr[i]){
                highvalue=arr[i];
                ans=i;

            }

        }
        return ans;
        
    }
    
}
