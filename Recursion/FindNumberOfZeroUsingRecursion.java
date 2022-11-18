package Recursion;

public class FindNumberOfZeroUsingRecursion {
    public static int GetCountZero(int num, int answer) {

        // base condition
        int checkReamainder;
        if (num == 0) {
            return answer;
        }

        checkReamainder = num % 10;
        if (checkReamainder == 0)
            // answer++;
            return GetCountZero(num/10, answer=answer+1);

        return GetCountZero(num/10, answer);

    }

    public static void main(String[] args) {
        System.out.println("Ans is:"+GetCountZero(5466006, 0));

    }

}
