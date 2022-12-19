package LeetcodeSpecialProblem;

import java.util.Arrays;

public class UglyNumber {
    public static boolean isUgly(int n) {
        // corner case
        if(n==1){
            return true;
        }
        int index = 0;
        boolean check;
        int[] array = new int[n];
        for (int i = 2; i < n + 1; i++) {
            check = true;
            for (int j = 2; j < i; j++) {

                if (i % j == 0) {
                    check = false;
                }

            }
            // increment count
            if (check) {
                array[index] = i;
                index++;
            }
        } 

        // checking ugly number
        for(int i=0;i<1;i++){
            for(int j=i;j<3;j++){
                if(array[i]*array[j]==n){
                    return true;
                }
            }
        }
        return false;

    }

    public static void main(String[] args) {
        // int[] arry=
        System.out.println(isUgly(8));

    }

}
