package Arrays;

public class Find_Numbers_with_Even_Number_of_Digits_Brute {
    public static int findNumbers(int[] nums) {
        int result=0;
        int count;
        for(int i:nums){
            count=0;
            while(i>0){
                count++;
                i=i/10;
            }
            // Cheking Even number of digit
            if(count%2==0){
                result++;
            }
        }
        return result;
        
    }
    public static void main(String[] args) {
        int[] array={555,901,482,1771};
        System.out.println(findNumbers(array));
        System.out.println("1270".length());
        Integer num=454545;
        System.out.println(num.toString().length());
    }
    
}
