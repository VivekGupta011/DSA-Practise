package Arrays;

public class Find_Numbers_with_Even_Number_of_Digits_Optimized {
    public static int findNumbers(int[] nums) {
        int count = 0;
        for(int i=0; i<nums.length; i++){

            // Converting Int to String
          if(Integer.toString(nums[i]).length()%2==0)
            count += 1;
        }
        return count;
      }


      static long findGoodPairs(int a[], int n, int k){
        // Code your solution here.
        long count=1;
        int sum;
        for(int i=0;i<a.length;i++){
            sum=0;
            sum=a[i];
            for(int j=0;j<a.length;j++){
                sum+=a[j];
                // System.out.println(sum);
                if(n==sum){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {

      int n = 4, k = 1;
      int[] arr={1, 1, 1, 1};
      System.out.println("Ans is:"+findGoodPairs(arr, n, k)); 

        // int[] array={555,901,482,1771};
        // System.out.println(findNumbers(array));
        
    }
    
}
