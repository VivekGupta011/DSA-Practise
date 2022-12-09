package Stack;

public class FirstNegativeIntegerInEveryWindowOfSizek {
    public static void FindKValue(int[] array) {
        // two subarray
        for (int i = 0; i < array.length - 1; i++) {
            int j = i + 1;
            if (array[i] < 0) {
                System.out.print(array[i]+" ");
            }
            if (array[j] < 0) {
                System.out.print(array[j]+" ");
            }
            if (array[i] > 0 && array[j] > 0) {
                System.out.print(" 0 ");
            }

        }
        System.out.println("three subarray!");

        // three subarray
        for(int i=0;i<array.length-2;i++){
            int j=i+1;
            int k=j+1;
            int num1;
            int num2;

            if(array[i]<array[j]){
                num1=array[i];
            }else{
                num1=array[j];
            }
            if(array[j]<array[k]){
                num2=array[j];
            }else{
                num2=array[k];
            }

            // checking positive or negative number
            if(num1>0 && num2>0){
                System.out.print(" 0 ");
            }else{
                if(num1<num2){
                    System.out.print(num1+" ");
                }else{
                    System.out.print(num2+" ");

                }
            }


            // if (array[i] < 0) {
            //     System.out.print(array[i]+" ");
            // }
            // if (array[j] < 0) {
            //     System.out.print(array[j]+" ");
            // }
            // if (array[k] < 0) {
            //     System.out.print(array[k]+" ");
            // }
            // if (array[i] > 0 && array[j] > 0 && array[k] >0) {
            //     System.out.print(" 0 ");
            // }

        }
    }

    public static void main(String[] args) {
        int[] arr = { 7, 9, -1, 2, 3, 4, -2, -3, -4 };
        FindKValue(arr);
    }

}
