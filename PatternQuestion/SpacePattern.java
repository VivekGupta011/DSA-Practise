package PatternQuestion;

public class SpacePattern {
    public static void PatternQuestion(){
        for(int i=0;i<5;i++){
            for(int k=0;k<4-i;k++){
                System.out.print(" ");

            }
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        PatternQuestion();
    }
    
}
