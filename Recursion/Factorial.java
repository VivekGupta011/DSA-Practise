package Recursion;

public class Factorial {

    public static int FactorialNum(int num) {
        if (num == 0) {
            return 1;
        }
        
        return num * FactorialNum(num - 1);
        // for(int i=1;i<num+1;i++){
        // total=total*i;
        // }

    }

    public static void main(String[] args) {
        
         System.out.println("ans is:"+FactorialNum(4));

    }

}
