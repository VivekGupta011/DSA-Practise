package Strings;

public class RemoveConsecutiveCharacters {
    public static void main(String[] args) {
        String s = "abbbbbaal";
        // output:ab
        System.out.println("Ans is:"+remove(s));

    }

    public static String remove(String input) {
        int n=input.length();
        String res="";
        for(int i=0;i<n;i++){
            if(i<n-1 && input.charAt(i)==input.charAt(i+1)){
                continue;
            }
            else{
                res+=input.charAt(i);
                
            }
        }
        return res;
    }
}
