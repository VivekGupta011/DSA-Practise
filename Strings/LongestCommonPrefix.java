package Strings;


public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] StringArray={"flower","flow","floight"};
        System.out.println("Ans is:"+longestCommonPrefix(StringArray));
        
    }
    public static String longestCommonPrefix(String[] strs) {
        String prefix=strs[0];
        for(String s:strs){
            int i=0;
            int j=0;
            // int i=0
            // while(i<Math.min(prefix.length(), s.length()) && prefix.charAt(i)==s.charAt(i)){
            //     i++;
            // }
            while(i<prefix.length() && j<s.length() && prefix.charAt(i)==s.charAt(j)){
                i++;
                j++;

            }
            prefix=s.substring(0, i);
        }
        return prefix;
        
    }
    
}
