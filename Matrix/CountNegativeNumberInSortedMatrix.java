package Matrix;

public class CountNegativeNumberInSortedMatrix {

    public static int NegativeCounter(int[][] Matrix){
        int len=Matrix.length;
        int count=0;
        for(int i=0;i<len;i++){
            for(int j=0;j<Matrix[i].length;j++){
                if(Matrix[i][j]<0){
                    count++;

                }
            }
            System.out.println();
        }
        return count;

    }

    public static void main(String[] args) {
        int mat[][]={{4,3,2,1},{7,6,7}};
        System.out.println("Ans is:"+NegativeCounter(mat));
        // NegativeCounter(mat);        
    }
    
}
