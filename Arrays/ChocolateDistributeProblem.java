package Arrays;

import java.util.Arrays;

public class ChocolateDistributeProblem{
    public static void main(String[] args) {
        System.out.println("Ans is:"+Arrays.toString(distributeCandies(10,3)));
        
    }
    public static int[] distributeCandies(int candies, int num_people) {
        int[] People=new int[num_people];
        int Candies_Count=1;
        int Total_candies=0;
        for(int i=0;i<=num_people;i++){
            if(num_people==i){
                People[0]+=candies-Total_candies;
            }else{
                Total_candies+=Candies_Count;
                People[i]=Candies_Count;
                Candies_Count++;
            }
           
            
        }
        return People;
        
    }

}