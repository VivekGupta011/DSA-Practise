package Recursion;

import java.util.ArrayList;

public class SearchArrayElementUsingRecursion {
    // check array element from End
    public static int CheckArrayElementFromLast(int[] array, int target, int index) {

        // Base Condition
        if (index < 0) {
            return -1;
        }

        // check requirement
        if (array[index] == target) {
            return index;
        }

        return CheckArrayElementFromLast(array, target, index - 1);

    }

    // check array element from starting
    public static int CheckArrayElementFromStarting(int[] array, int target, int index) {

        // Base Condition
        if (index == array.length) {
            return -1;
        }

        // check requirement
        if (array[index] == target) {
            return index;
        }

        return CheckArrayElementFromStarting(array, target, index + 1);

    }

    // Add all element present in array into ArrayList
    static ArrayList<Integer> list = new ArrayList<>();
    public static void CheckArrayElementFromStartingTOLast(int[] array, int target, int index) {

        // Base Condition
        if (index == array.length) {
            return;
        }

        // check requirement
        if (array[index] == target) {
            list.add(index);
        }

        CheckArrayElementFromStartingTOLast(array, target, index + 1);

    }

    public static void main(String[] args) {
        int[] array = { 4, 23, 45, 67, 56, 54, 343, 25243, 54, 234 };
        int Ans = CheckArrayElementFromLast(array, 45, array.length - 1);
        if (Ans != -1) {
            System.out.println("Target present at index number:" + Ans);
        } else {
            System.out.println("Target is Not present at index number");

        }

        // checking value from starting to end index
        CheckArrayElementFromStartingTOLast(array, 54, 0);
        System.out.println("Ans is:"+list);

    }

}
