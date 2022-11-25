package SortAlgorithm;

import java.util.Arrays;

import fundamental.Array;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={5,56,36,34,56,2,34,57,1};
        Selection(arr);
        System.out.println("Selection:"+Arrays.toString(arr));
    }

    static void Selection(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int smallest=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[smallest]>arr[j]){
                    smallest=j;

                }
            }
            int temp=arr[smallest]; 
            arr[smallest]=arr[i];
            arr[i]=temp;
            
        }

    }
}
