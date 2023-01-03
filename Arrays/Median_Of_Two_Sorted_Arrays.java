package Arrays;

public class Median_Of_Two_Sorted_Arrays {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int arr1 = nums1.length;
        int arr2 = nums2.length;
        int ArraySize = arr1 + arr2;

        // Result Array
        int[] ResultArray = new int[ArraySize];
        int index = 0;
        int i = 0;
        int j = 0;

        // Two pointer Approach
        while (i < arr1 && j < arr2) {
            if (nums1[i] < nums2[j]) {
                ResultArray[index] = nums1[i];
                i++;
                index++;
            } else {
                ResultArray[index] = nums2[j];
                j++;
                index++;
            }
        }

        // if array 1 and array 2 is empty before second array
        while (i < arr1) {
            ResultArray[index] = nums1[i];
            i++;
            index++;
        }

        while (j < arr2) {
            ResultArray[index] = nums2[j];
            j++;
            index++;
        }

        // Cheking Condition for Even odd
        if (ArraySize % 2 != 0) {
            return ResultArray[ArraySize / 2];
        }

        if (ArraySize % 2 == 0) {
            int mid = (arr1 + arr2) / 2;
            double midFirst = ResultArray[mid];
            double midSecond = ResultArray[mid - 1];
            return (midFirst + midSecond) / 2;
        }
        // for (int c : ResultArray) {
        // System.out.print(c + " ");
        // }

        return -1.0;

    }

    public static void main(String[] args) {
        int[] array1 = { 1, 3 };
        int[] array2 = { 2 };
        // findMedianSortedArrays(array1, array2);
        System.out.println("Ans is:" + findMedianSortedArrays(array1, array2));
    }

}
