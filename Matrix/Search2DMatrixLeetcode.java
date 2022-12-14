package Matrix;

public class Search2DMatrixLeetcode {

    public static boolean searchMatrix(int[][] matrix, int target) {
        boolean result=false;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                 if(matrix[i][j]==target){
                     result=true;
                 }
            }
        }

        return result;

    }

    public static void main(String[] args) {
        int[][] matrix={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        System.out.println("Ans is:"+searchMatrix(matrix, 0));
    }
    
}
