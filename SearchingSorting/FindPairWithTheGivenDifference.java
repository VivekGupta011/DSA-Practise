package SearchingSorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FindPairWithTheGivenDifference {
    public static void main(String[] args) {
        int[] array={5, 20, 3, 2, 50, 80};
        int n=80;
        DifferenceFinder(array, n);
    }

    public static void DifferenceFinder(int[] array,int n){
        // arranging in non-decreasing order
        Arrays.sort(array);
        
        boolean DifferenceChecker=false;
        for(int i=array.length-1;i>0;i--){
            for(int j=0;j<array.length;j++){
                if(array[i]-array[j]==-30){
                    System.out.println("Difference pair is:"+"("+array[j]+","+array[i]+")");
                    DifferenceChecker=true;
                }
            }
        }
        if(!DifferenceChecker){
            System.out.println("No Such Pair");
            
        }
        



    }
    
}
