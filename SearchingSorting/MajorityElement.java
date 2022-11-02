package SearchingSorting;

import java.util.Arrays;

public class MajorityElement {
    //A majority element in an array A[] of size n is an element that appears more than n/2 times
    public static void main(String[] args) {
        int[] array={1, 1, 2, 1, 3, 5, 1 };
        int n=array.length;
        ElementChecker(array,n);
        
    }

    public static void ElementChecker(int[] array,int n){
        Arrays.sort(array);
        int Maxcount=0;
        int index=-1;
        for(int i=0;i<array.length;i++){
            int count=0;
            for(int j=0;j<array.length;j++){
                if(array[i]==array[j]){
                    count++;

                }

            }

            // updating MaxCount value
            if(count>Maxcount){
                Maxcount=count;
                index=i;
            }

        }
         System.out.println("Ans is:"+Maxcount);
         System.out.println("Ans is value:"+index);
        // checking Majority Element
        if(Maxcount > (n/2)){
            System.out.println("Majority Element:"+array[index]);
        }else{
            System.out.println("Majority Element Not Found");
        }

    }

    
}
