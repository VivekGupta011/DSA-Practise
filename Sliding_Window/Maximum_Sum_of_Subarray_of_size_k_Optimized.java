package Sliding_Window;

public class Maximum_Sum_of_Subarray_of_size_k_Optimized {

    static int maxSum(int arr[], int n, int k) {

        // check subarray is valid or not
        if (n < k) {
            System.out.println("Invalid Windoe");
            return -1;
        }

        // Compute sum of first window of size k
        int max_sum = 0;
        for (int i = 0; i < k; i++) {
            max_sum += arr[i];
        }
        // current window
        int window_sum = max_sum;
        for (int i = k; i < n; i++) {
            window_sum += arr[i] - arr[i - k];
            max_sum = Math.max(max_sum, window_sum);
        }
        return max_sum;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, 2, 10, 2, 3, 1, 0, 20 };
        int k = 4;
        int n = arr.length;
        System.out.println(maxSum(arr, n, k));

    }

}
