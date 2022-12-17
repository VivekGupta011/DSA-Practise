package Arrays;

public class InfiniteArrayOptimizedSolution {

    public static int NumberSearch(int[] array,int start,int last,int target){
        int first=start;
        int end=last;
        while(first<=end){
            int mid=first+(end-first)/2;
            if(array[mid]==target){
                return mid;
            }
            if(array[mid]<target){
                first=mid+1;
            }
            if(array[mid]>target){
                end=mid-1;
            }
        }
        return -1;
        

    }

    public static int CheckFirstLastIndex(int[] array,int target){
        int start=0;
        int last=1;
        while(array[last]<target){
            start=last;
            last=2*last;
        }
        return NumberSearch(array,start,last,target);

    }

    public static void main(String[] args) {
        int[] array={3,5,7,9,10,90,100,130,140,160,170};
        System.out.println("Ans is:"+CheckFirstLastIndex(array, 160));
        // CheckFirstLastIndex(array, 18);
        
    }
    
}
