package Matrix;

import java.util.Scanner;

public class MatrixInput {
    
    static Scanner in=new Scanner(System.in);

    public static void matrixMultiplication(int[][] TwoArray,int row,int col){
        
        System.out.println("Enter Matrix data:");
        // taking matrix value from user
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                TwoArray[i][j]=in.nextInt();
            }
        }
        
        // printing the matrix
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(TwoArray[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        
        System.out.println("Enter row of matrix:");
        int row=in.nextInt();
        
        System.out.println("Enter column of matrix:");
        int col=in.nextInt();

        // creating a twoD array
        int[][] Matrix=new int[row][col];

        // calling method
        matrixMultiplication(Matrix, row, col);


        
        
    }
    
}
