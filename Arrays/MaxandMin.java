package Arrays;

public class MaxandMin {
    public static void main(String[] args) {
        int[] arr={3,4,5,3,5,6,7,8,12,1,87,24,20,34};
        MaxElement(arr);
        MinElement(arr);
        
    }
    public static void MaxElement(int[] arr){
        int Max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(Max<arr[i]){
                Max=arr[i];
            }

        }
        System.out.println("Maximum Element:"+Max);

        
    }
    public static void MinElement(int[] arr){
        int Min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(Min>arr[i]){
                Min=arr[i];
            }

        }
        System.out.println("Minimum Element:"+Min);

    }
    
}
