package Strings;

import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {
        String s="vivek8",t="keviv8";
         System.out.println("Ans is:"+isAnagram(s, t));
        
    }
    public static boolean isAnagram(String s, String t) {

       //Converting  string to character array
       char CharArray[]=s.toCharArray();
       char CharTarget[]=t.toCharArray();
       Arrays.sort(CharArray);
       Arrays.sort(CharTarget);
       //Converting character array to String
       String ArrayString=new String(CharArray);
       String TargetString=new String(CharTarget);
      //checking equal or not    
       if(ArrayString.equals(TargetString)){
        return true;
       }
       return false;
       
      

        
    }
    
}
