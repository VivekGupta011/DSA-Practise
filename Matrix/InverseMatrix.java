package Matrix;

public class InverseMatrix {
    public static void Reverse(int[][] array){
        for(int i=0;i<array.length;i++){
            int start=0;
            int end=array.length-1;
            int temp;
            while(start<end){
                temp=array[i][start];
                array[i][start]=array[i][end];
                array[i][end]=temp;
                // increment and decrement start and end
                start++;
                end--;
            }
        }

        System.out.println("Printing output:");
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] array={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Printing Original output:");
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }

        Reverse(array);

        
    }
    
}
