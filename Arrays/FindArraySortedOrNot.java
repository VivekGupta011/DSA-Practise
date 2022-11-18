package Arrays;

public class FindArraySortedOrNot {
    public static boolean CheckSort(int[] array){
        boolean CheckSortArray=false;
        for(int i=0;i<array.length-1;i++){
            if(array[i]<array[i+1]){
                CheckSortArray=true;
            }else{
                CheckSortArray=false;

            }
        }
        return CheckSortArray;

    }
    public static void main(String[] args) {
        int[] array={1,3,5,6,7,8,15,20,8};
        System.out.println("Ans is:"+CheckSort(array));
    }
    
}
