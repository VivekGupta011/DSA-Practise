package Recursion;

public class FindNaturalSumBasic {
public static void main(String[] args) {
    System.out.println("Ans is:"+NaturalSum(5));
}
public static int NaturalSum(int num){
    int sum=0;
   for(int i=1;i<=num;i++){
    sum+=i;

   }
   return sum;

}
    
}
