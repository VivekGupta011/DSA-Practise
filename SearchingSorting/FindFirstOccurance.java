package SearchingSorting;

public class FindFirstOccurance {
    
    public static void main(String[] args) {
        int[] array={4,5,6,7,6};
        int target=6;
        System.out.println("Ans is:"+FindFirstOccuranceFunction(array,target));
        
    }
    public static int FindFirstOccuranceFunction(int[] array,int target){

        for(int i=0;i<array.length;i++){
            if(array[i]==target){
                return i;
            }
        }
        return -1;


    }
}
