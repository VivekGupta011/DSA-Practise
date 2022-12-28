package Strings;

public class Find_the_Index_of_the_First_Occurrence_in_a_String {

    public static int strStr(String haystack, String needle) {
         
        for(int i=0;i<haystack.length();i++){
            int j;
            for(j=0;j<needle.length() && (i+j)<haystack.length();j++){
                if(haystack.charAt(i+j)==needle.charAt(j)){
                    continue;
                }else{
                    break;
                }
            }
            // return first occcurrance index
            if(j==needle.length()){
                return i;
            }
        }

        return -1;
        
    }
    public static void main(String[] args) {
        String str1="leetcode";
        String str2="leeto";
       System.out.println("Ans is:"+strStr(str1, str2));

    }
    
}
