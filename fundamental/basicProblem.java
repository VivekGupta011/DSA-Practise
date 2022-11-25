package fundamental;

import java.util.Scanner;

public class basicProblem {
    public static void main(String[] args){
        // defining scanner or user input
        Scanner scn=new Scanner(System.in);

        System.out.println("Enter your salary amount:");
        int userSalary=scn.nextInt();

        if(userSalary>3000){
            int add=2000;
            int totalAmount=add +userSalary;
            System.out.println("you are Eligible for bonus:"+totalAmount);
        }else if(userSalary<3000){
            int add=1000;
            int totalAmount=add +userSalary;
            System.out.println("you are not Eligible for bonus:"+totalAmount);

        }

    }
    
}
