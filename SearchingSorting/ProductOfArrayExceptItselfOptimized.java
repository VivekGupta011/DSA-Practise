package SearchingSorting;

import java.lang.reflect.Array;
import java.util.Arrays;


// with division operator
public class ProductOfArrayExceptItselfOptimized {
    public static void main(String[] args) {
        int[] array={4,2,1,7};
        System.out.println("Ans is:"+Arrays.toString(ProductCreator(array)));
        
    }

    public static int[] ProductCreator(int[] array){
        int[] ProductOfArray=new int[array.length];
        int TotalProduct=1;
        for(int i=0;i<array.length;i++){
            TotalProduct=TotalProduct*array[i];

        }
        
        for(int i=0;i<array.length;i++){
            ProductOfArray[i]=TotalProduct/array[i];
            
        }
        return ProductOfArray;

    }
    
}
