package Number;

import java.util.Arrays;

public class Find_Maximum_three_product {

    public static void maximumProduct(int[] nums) {

        int Arraylen = nums.length;
        int[] result = new int[Arraylen];
        int index = 0;
        int negativeCount=0;
        for (int c : nums) {
            if (c < 0) {
                negativeCount++;
                c = c * -1;
                result[index] = c;
            } else {
                result[index] = c;
            }
            // increment index
            index++;

        }

        // sorting array
        Arrays.sort(result);

        // for maximum three product
        int maxproduct = 1;
        int arrayDecrement = Arraylen - 1;
        for (int i = 0; i < 3; i++) {
            maxproduct = maxproduct * result[arrayDecrement];
            arrayDecrement--;

        }

        //adding negative number
        if(negativeCount%2!=0){
            maxproduct=maxproduct*-1;
        } 
        // return maxproduct;
        System.out.println("negative count:"+negativeCount);
        System.out.println("maxproduct:"+maxproduct);
    }

    public static void main(String[] args) {
        int[] array = { 5,6,1,1,3,-5,-7,-8,7,9};
        maximumProduct(array);

    }

}
