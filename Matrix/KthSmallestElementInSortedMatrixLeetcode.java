package Matrix;

public class KthSmallestElementInSortedMatrixLeetcode {
    public static int kthSmallest(int[][] matrix, int k) {
        int index=0;
        int result=-1;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                index++;
                if(index==k){
                    result=matrix[i][j];

                }
            }
        }
        return result;
        
    }

    public static void main(String[] args) {
        int[][] matrix={{1,5,9},{10,11,13},{12,13,15}};
        int k=3;
        System.out.println("Ans is:"+kthSmallest(matrix, k));

    }
    
}
