package Strings;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CheckAscending {


    public static boolean areNumbersAscending(String s) {
        int prev = 0;
    
        for (final String token : s.split(" ")){
            System.out.println("token:"+token);
            if (Character.isDigit(token.charAt(0))) {
                final int num = Integer.parseInt(token);
                if (num <= prev)
                  return false;
                prev = num;
              }
        }
          
    
        return true;
      }


      public static int countNicePairs(int[] nums) {
        int NicePair=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int first=nums[i];
                int firstCopy=nums[i];
                int second=nums[j];

                // reversing number(for i value)
                String str1="";
                while(first>0){
                    int res=first%10;
                    str1+=res;
                    first=first/10;
                }

                // then first reversed then convert into integer
                int FirstReversed=Integer.parseInt(str1);
                System.out.println("f:"+FirstReversed);
                FirstReversed=FirstReversed+second;


                // reversing number(for j value)
                String str2="";
                while(second>0){
                    int res=second%10;
                    str2+=res;
                    second=second/10;
                }

                // then first reversed then convert into integer
                int SecondReversed=Integer.parseInt(str2);
                System.out.println("before"+SecondReversed);
                SecondReversed=SecondReversed+firstCopy;
                System.out.println("after:"+SecondReversed);

                // now checking our condition Matching or not
                if(FirstReversed==SecondReversed){
                    NicePair++;
                }

                break;


            }
        }

        return NicePair;
        
    }

      public static void SplitCheck(String s){
        ArrayList<String> list=new ArrayList<>();
        for(String i:s.split(" ")){
            list.add(i);
        }
        Collections.sort(list);
        System.out.println("Ans is:"+list);
      }

    public static void main(String[] args) {
        // String text="1 box has 3 blue 4 red 6 green and 12 yellow marbles";
        // String text1="is2 sentence4 This1 a3";
        // System.out.println("Ans is:"+areNumbersAscending(text));
        // SplitCheck(text1);
        
        int[] array={42,11,1,97};
        System.out.println(countNicePairs(array));
        
    }
    
}
