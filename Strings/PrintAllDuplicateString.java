package Strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PrintAllDuplicateString {
    public static void main(String[] args) {
        String input="arjunaa";
        PrintAllDuplicateString pp=new PrintAllDuplicateString();
        pp.CountDuplicate(input);
        
    }

    public  void CountDuplicate(String input){
        if(input.isEmpty()){
            System.out.println("Empty String");
            return;
        }
        if(input.length()==1){
            System.out.println("Single char String");
            return;
        }
        char[] CharArray=input.toCharArray();
        Map<Character,Integer> charMap=new HashMap<Character,Integer>();
        for(Character ch:CharArray){
            if(charMap.containsKey(ch)){
                charMap.put(ch, charMap.get(ch)+1);

            }else{
                charMap.put(ch, 1);
            }
        }

        //print the map
        Set<Map.Entry<Character,Integer>> entrySet=charMap.entrySet();
        for(Map.Entry<Character,Integer> entry:entrySet){
            if(entry.getValue()>1){
                System.out.println(entry.getKey()+":"+entry.getValue());
            }
        }
       
        

    }
    
}
