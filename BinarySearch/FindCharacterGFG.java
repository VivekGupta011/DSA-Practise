package BinarySearch;

import java.applet.Applet;

public class FindCharacterGFG {
    public static void main(String[] args) {
        char letters[]={'A','b','c','d','f','g','h','i'};
        char target='h';
        char result=nextGreatest(letters, target);
        System.out.println("Ans is:"+result);
        
    }
    static char nextGreatest(char letters[],char target){
        int n=letters.length;
        if(target>=letters[n-1]){
            return letters[0];

        }
        int start=0,end=letters.length-1;
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
           
            if(letters[mid]>target){
                end=mid-1;

                ans=mid;

            }else{
                start=mid+1;
            }
        }
        return letters[ans];
    }
}
