package Recursion;

public class FindNumberOfZero {

    public static int GetZero(int num) {
        int CountZero = 0;
        int remainder;
        while (num > 0) {

            remainder = num % 10;
            if (remainder == 0) {
                CountZero++;
            }
            num = num / 10;

        }
        return CountZero;

    }

    public static void main(String[] args) {
        System.out.println("Ans is:" + GetZero(560060));

    }

}
