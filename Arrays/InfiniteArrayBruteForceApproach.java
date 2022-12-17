package Arrays;

public class InfiniteArrayBruteForceApproach {

    public static int CheckInfinite(int[] array,int target){

        int i=0;
        while(array[i]<=target){
            if(array[i]==target){
                return i;
            }else{
                i=i+1;
            }

        }
        return -1;

    }

    public static void main(String[] args) {
        int[] array={1,3,5,8,12,15,17,18,20,28,30,140,2020};
        System.out.println("Ans is:"+CheckInfinite(array, 18));
    }
    
}
