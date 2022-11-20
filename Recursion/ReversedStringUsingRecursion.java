package Recursion;

public class ReversedStringUsingRecursion {
    public static String ReversedString(String word,int length){
        String name="";
        
        if(length<=-1){
            System.out.println("Ans is:"+name);
            return name;
        }
        return name+word.charAt(length)+ReversedString(word, length-1);

        

        // return 
    }
    public static void main(String[] args) {
        String name="vivekGupta";
        int StringLength=name.length()-1;
        System.out.println("Ans is:"+ReversedString(name, StringLength));

        
    }
    
}
