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

      public static void SplitCheck(String s){
        ArrayList<String> list=new ArrayList<>();
        for(String i:s.split(" ")){
            list.add(i);
        }
        Collections.sort(list);
        System.out.println("Ans is:"+list);
      }
    public static void main(String[] args) {
        String text="1 box has 3 blue 4 red 6 green and 12 yellow marbles";
        String text1="is2 sentence4 This1 a3";
        System.out.println("Ans is:"+areNumbersAscending(text));
        SplitCheck(text1);
        
    }
    
}
