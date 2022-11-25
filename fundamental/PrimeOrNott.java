package fundamental;

import java.util.Scanner;

public class PrimeOrNott {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int user = sc.nextInt();
        int init = 2;
        boolean set = false;
        for (init = 2; init < user; init++) {
            if (user % init == 0) {
                set = true;
                break;
            }
        }
        if (!set) {
            System.out.println("prime:" + user);

        } else {

            System.out.println("not prime:" + user);
        }

    }

}
