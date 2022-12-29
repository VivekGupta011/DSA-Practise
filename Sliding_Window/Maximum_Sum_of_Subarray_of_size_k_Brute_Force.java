package Sliding_Window;

public class Maximum_Sum_of_Subarray_of_size_k_Brute_Force {
    static int maxSum(int arr[], int n, int k){

        // initialize result
        int max_sum=Integer.MIN_VALUE;

        //using for loop
        for(int i=0;i<n-k+1;i++){
            int current_sum=0;
            for(int j=0;j<k;j++){
                current_sum=current_sum+arr[i+j];
            }

            // cheking current_sum is greater or not
            max_sum=Math.max(max_sum, current_sum);
        }
        return max_sum;
    }


    public static void main(String[] args) {
        int arr[] = { 1, 4, 2, 10, 2, 3, 1, 0, 20 };
        int k = 6;
        int n = arr.length;
        System.out.println(maxSum(arr, n, k));
        
    }
    
}
