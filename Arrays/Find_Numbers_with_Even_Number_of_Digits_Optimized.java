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

    public static void main(String[] args) {
        int[] array={555,901,482,1771};
        System.out.println(findNumbers(array));
        
    }
    
}
