package Recursion;

public class NumberFrom1To5 {

    public static void PrintNumber(int num, int index) {
        if (num <= 0) {
            return;
        } else {

            System.out.println("Ans is:" + index);
            PrintNumber(num - 1, index + 1);

        }
        // if()
    }

    public static void main(String[] args) {
        PrintNumber(5, 0);
    }

}
