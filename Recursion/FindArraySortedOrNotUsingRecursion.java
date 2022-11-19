package Recursion;

public class FindArraySortedOrNotUsingRecursion {

    public static boolean CheckSortOrNot(int[] array,int index){
        
        // Base Condition
        if(index==array.length-1){
            return true;
        }

        return array[index]<array[index+1] && CheckSortOrNot(array, index+1);
    }
    public static void main(String[] args) {
        int[] array={1,3,5,6,7,8,15,20};
        System.out.println("Ans is:"+CheckSortOrNot(array,0));
    }
    
}
