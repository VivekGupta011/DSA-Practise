package Arrays;
import java.util.*;

public class ChocolateDistributeProblemOptimized {
    public static void main(String[] args) {
        System.out.println("Ans is:"+Arrays.toString(distributeCandies(7, 4)));
    }
    public static int[] distributeCandies(int candies, int num_people){
        int[] result=new int[num_people];
        int index=0;
        int candie=1;
        while(candies>0){
            result[index++%num_people]+=Math.min(candies, candie);
            candies-=candie;
            candie++;
        }
        return result;
        
    }
}
