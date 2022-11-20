package Strings;

public class StringReversed {

    public static void ReversedString(String word){
        String name="";
        for(int i=word.length()-1;i>=0;i--){

            name=name+word.charAt(i);
        }
        System.out.println("Ans is:"+name);

    }
    public static void main(String[] args) {
        ReversedString("vivek");
    }
    
}
