package Arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array={4,5,6,7,435,54,5,45};
        ReverseArrayElement(array);
    }

    public static void ReverseArrayElement(int[] array){
        // creating a new array
        int[] NewArray=new int[array.length];
        int index=0;
        for(int i=array.length-1;i>=0;i--){
         
                NewArray[index]=array[i];
                index++;
           

        }

        System.out.println("Reversed Array is:"+Arrays.toString(NewArray));
        System.out.println("Original Array is:"+Arrays.toString(array));
    }
    
}
