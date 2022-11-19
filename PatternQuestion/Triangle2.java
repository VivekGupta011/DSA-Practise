package PatternQuestion;

public class Triangle2 {

    public static void TriangelPattern(){
        for(int i=0;i<4;i++){
            for(int j=0;j<1+i;j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
    public static void main(String[] args) {
        TriangelPattern();
    }
    
}
