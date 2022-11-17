package LinearSearch;
public class LeetcodeProblem {
    public static void main(String[] args) {
        int[][] Array={{5,4,5},{8,9,6},{7,6,5}};
        int row=3;
        int col=3;
        int ans=0;
        int sum=0;
        for(int i=0;i<row;i++){
            System.out.println("sum value:"+sum);
            for(int j=0;j<col;j++){
                sum=sum+Array[i][j];
                
            }
            System.out.println("sum value in 2nd for loop :"+sum);
            if(ans<sum){
                ans=sum;
            }
        }
        System.out.println("Highest sum of index number is:"+ans);
    }
    
}
