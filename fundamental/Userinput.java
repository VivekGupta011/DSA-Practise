package fundamental;


// there are two way to take input from user
// 1.BufferedReader class 2.Scanner class(updated version of BufferedReader class)
import java.util.Scanner;
class UserInput {
    public static void main(String[] args) {
        // scanner defination
        Scanner scn = new Scanner(System.in);

        // Input is string(one word)
        System.out.println("Entered name Your name here: ");
        String data = scn.next();
        System.out.println("Your  name : " + data);
        
        System.out.println("Entered fullname Your name here: ");
        String StringData=scn.nextLine();
        System.out.println("Entered fullname : " + StringData);

    }
}
