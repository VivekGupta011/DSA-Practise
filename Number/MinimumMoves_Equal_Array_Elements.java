package Number;

public class MinimumMoves_Equal_Array_Elements {
    public static void minMoves(int[] nums) {
        int MinValue=nums[0];
        int MinimumMove=0;

        // for Minimum value
        for(int c:nums){
            if(c<MinValue){
                MinValue=c;
            }
        }

        // for Minimum Move for array
        for(int c:nums){
            MinimumMove=MinimumMove+(c-MinValue);
        }
        System.out.println("Ans is:"+MinimumMove);
        
    }

    public static void main(String[] args) {

        int[] array={0,0,0};
        minMoves(array);
        
    }
    
}
