package SearchingSorting;

import java.util.*;

public class everyPairIsgreaterOrEqualToK {
    public static void main(String[] args) {
        Integer[] a={2, 5, 3};
        int[] b= { 7, 8, 9 };
        int k=10;
        checker(a,b,k);

        
    }
    public static boolean checker(Integer[] a,int[] b,int k){
        // Arrange in increasing order
        Arrays.sort(b);
        Arrays.sort(a,Collections.reverseOrder());
        // int index=0;
        // for(int i=a.length-1;i>=0;i--){
        //     a[index]=a[i];
        //     index++;


        // }


        // Arrange in decrease order
        System.out.println("Ans is:"+Arrays.toString(b));
        System.out.println("Ans is:"+Arrays.toString(a));
        return true;

    }
    
}

