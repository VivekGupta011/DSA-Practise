package BinarySearch;

public class FindPeakElementLeetcodeBruteForceApproach {
    public static int PeakElement(int[] array) {
        int ans=0;
        for (int i = 0; i < array.length - 2; i++) {
            if (array[i + 1] > array[i] && array[i + 1] > array[i + 2]) {
                ans = i + 1;

            }
        }
        return ans;

    }

    public static void main(String[] args) {
        int[] array = {1,2,1,3,5,6,4};
        System.out.println("Ans is:" + PeakElement(array));
    }

}
