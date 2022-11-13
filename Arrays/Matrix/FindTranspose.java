package Arrays.Matrix;

public class FindTranspose {

    // method for printing twoD array
    public static void Display(int[][] TransposeNew) {
        int row = 3;
        int col = 3;
        System.out.println("The Matrix is:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(TransposeNew[i][j] + " ");

            }
            System.out.println();
        }

    }

    public static void GetTranspose(int[][] A) {
        // creating a new 2 array
        int row = 3;
        int col = 3;

        int[][] ans = new int[3][3];

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                ans[j][i] = A[i][j];

        Display(ans);

    }

    public static void main(String[] args) {
        // creating a matrix
        int Transpose[][] = { { 1, 2, 3 }, { 2, 3, 4 }, { 4, 5, 6 } };
        GetTranspose(Transpose);

    }

}
