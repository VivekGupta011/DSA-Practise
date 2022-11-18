package Number;

import javax.sound.sampled.SourceDataLine;

public class ReduceaNumberToZeroLeetcode {
    public static int numberOfSteps(int num) {
        int StepCount=0;
       while(num>0){
        if(num%2==0){
            num=num/2;
            StepCount++;
        }else{
            num=num-1;
            StepCount++;
        }
       }
       return StepCount;
    
            
    }
  
    public static void main(String[] args) {
        System.out.println("Ans is:"+numberOfSteps(8));
    }
}
