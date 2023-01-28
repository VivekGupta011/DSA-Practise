package SortAlgorithm;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 2, 0, 1 };
        bubble(arr);
        System.out.println("Bubble sort:" + Arrays.toString(arr));
        System.out.println(4% 5);

    }

    static void bubble(int[] arr) {
        // run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            // for each step,max item will come at the last respective index
            for (int j = 1; j < arr.length - i; j++) {
                // swap if the item is smalller than the previous item
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }

        }
    }
}
