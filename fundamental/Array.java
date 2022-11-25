
package fundamental;
import java.util.Scanner;

public class Array {
    public static final String To = null;

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //declaring and initializing array
        int arr1[]={4,5,6,7,8,9};
        int arr2[]=new int[5];
        System.out.println("Enter the numbers (size = 5) :"); 
        for(int i=0;i<5;i++){
            arr2[i]=sc.nextInt();
        }
        for(int i=0;i<5;i++){
           System.out.println("Enter array data"+ arr2[i]);
        }
        // arr2[6]=56;
        System.out.println("Enter new array data"+ arr2);


    }
}

