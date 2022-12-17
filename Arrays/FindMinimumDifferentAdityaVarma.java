package Arrays;

public class FindMinimumDifferentAdityaVarma {
    public static int CheckMinDifferent(int[] array,int key){
       int Diff=Integer.MAX_VALUE;
       Diff=key-array[0];
       int index=-1;
        for(int i=1;i<array.length;i++){
              
              if(key-array[i]<Diff){
                Diff=key-array[i];
                index=i;
              }
        }
        return index;

    }

    public static void main(String[] args) {
        int[] array = { 4, 6, 8,9 };
        int key = 10;
        System.out.println("Ans is:" + CheckMinDifferent(array, key));
    }

}
