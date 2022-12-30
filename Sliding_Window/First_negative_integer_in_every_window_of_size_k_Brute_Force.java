package Sliding_Window;

public class First_negative_integer_in_every_window_of_size_k_Brute_Force {

    static void printFirstNegativeInteger(int arr[], int n, int k) {
        boolean Check;
        for (int i = 0; i < n - k + 1; i++) {
            Check = false;
            for (int j = 0; j < k; j++) {
                if (arr[i + j] < 0) {
                    System.out.print(arr[i + j]);
                    Check = true;
                    break;
                }
            }
            if (!Check) {
                System.out.print(" " + 0 + " ");

            }
        }

    }

    public static void main(String[] args) {
        int[] arr = { 12, -1, -7, 8, -15, 30, 16, 28 };
        int k = 3;
        int n = arr.length;
        printFirstNegativeInteger(arr, n, k);

    }

}
