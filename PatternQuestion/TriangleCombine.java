package PatternQuestion;

public class TriangleCombine {

    public static void TriangleCombinePattern() {
        for (int i = 0; i < 5; i++) {
            for (int j = 1; j <= 1 + i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4-i ; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        TriangleCombinePattern();

    }

}
