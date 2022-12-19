package LeetcodeSpecialProblem;

public class CountPrime {
    public static int countPrimes(int n) {
        if(n==0 || n==1){
            return 0;
        }
        int PrimeCount=0;
        boolean check=true;
        for(int i=2;i<n+1;i++){
            check=true;
            for(int j=2;j<i;j++){
               
                if(i%j==0){
                    check=false;
                }
               
            }
            // increment count
            if(check){
                PrimeCount++;
                System.out.println(i);
            }

        }
        return PrimeCount;
    }
    public static void main(String[] args) {
        System.out.println("Ans is:"+countPrimes(10));
        int a=2;
        System.out.println(a++);
        
    }
    
}
