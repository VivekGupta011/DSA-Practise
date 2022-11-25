package fundamental;
import java.util.Scanner;

public class PrimeOrNottUsingWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int user = sc.nextInt();
        int init = 2;
        boolean set=false;
        
        while(init<user){
            if(user%init==0){
                set=true;
                break;
            }
            init=init+1;
        }
        if(!set){
            System.out.println("prime:"+user);
        }else
        System.out.println("prime not:"+user);
        

    }
    
}
