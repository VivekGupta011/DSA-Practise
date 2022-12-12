package Arrays;

public class ValidPerfectSquare {
    public static boolean isPerfectSquare(int num) {
        int SquareChecker=0;
        int start=0;
        boolean result=false;
        while(num>=SquareChecker){
            if(SquareChecker==num){
                result=true;
            }
            SquareChecker=start*start;
            start++;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Ans is:"+isPerfectSquare(47));
    }
    
}
