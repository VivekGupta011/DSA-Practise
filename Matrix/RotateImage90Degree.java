package Matrix;

public class RotateImage90Degree {
    
    public static void rotate(int[][] matrix) {

        // performing matrix transpose
        for(int i=0;i<matrix.length;i++){
            for(int j=i;j<matrix.length;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

        System.out.println("Printing Transpose image:");
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        // performing matrix reverse 
        for(int i=0;i<matrix.length;i++){
            int start=0;
            int end=matrix.length-1;
            int temp;
            while(start<end){
                temp=matrix[i][start];
                matrix[i][start]=matrix[i][end];
                matrix[i][end]=temp;
                // increment and decrement start and end
                start++;
                end--;
            }
        }

        System.out.println("Printing Rotated image:");
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        
    }


    public static void main(String[] args) {
        // [1,2,3],[4,5,6],[7,8,9]
        int[][] RotateImage={{1,2,3},{4,5,6},{7,8,9}};

        System.out.println("Before Rotated image:");
        System.out.println("Printing output:");
        for(int i=0;i<RotateImage.length;i++){
            for(int j=0;j<RotateImage.length;j++){
                System.out.print(RotateImage[i][j]+" ");
            }
            System.out.println();
        }

        rotate(RotateImage);

        
    }
    
}
