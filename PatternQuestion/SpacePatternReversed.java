package PatternQuestion;

public class SpacePatternReversed {
    public static void SpacePattern(){
        for(int i=0;i<5;i++){
            for(int k=4;k>i;k--){
                System.out.print(" ");

            }
            for(int j=0;j<i+1;j++){ 
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void SpacePatternReverse(){
        for(int i=0;i<5;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");

            }
            for(int k=5;k>i;k--){
                System.out.print("* ");

            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        SpacePattern();
        System.out.println(" ");
        System.out.println(" ");
        SpacePatternReverse();
    }
    
}
