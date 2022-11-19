package PatternQuestion;

public class Triangel {
    public static void PatternTriangle(){
        for(int i=0;i<4;i++){
            for(int j=4-i;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        PatternTriangle();
    }
    
}
