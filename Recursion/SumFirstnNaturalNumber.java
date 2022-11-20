package Recursion;

public class SumFirstnNaturalNumber {

    public static int NaturalSum(int num){
        
        // base condition
        if(num<=0){
            return 0;
        }
        return num+NaturalSum(num-1);
    }
    public static void main(String[] args) {
        System.out.println("Ans is:"+NaturalSum(4));
    }
    
}
