package Strings;

public class Reverssed_Word_String {

    public static String reverseWords(String s) {
        

        // converting String to String array so we can make modified
        String[] words=s.split(" ");
        StringBuilder sb=new StringBuilder();
        for(int i=words.length-1;i>=0;i--){
            sb.append(words[i]);
            sb.append(" ");
        }

      

        // for converting String array to string
        return sb.toString().trim();
        
    }


    public static void main(String[] args) {
        String words="the sky is blue";
        System.out.println("Ans is:"+reverseWords(words));
      
    }
    
}
