package Recursion;

public class AddTargetCharacterAtLastUsingRecursion {
    public static String AddLast(String word,char Target,int index){
        String EmptyA="";
        String EmptyB="";
        
        if(index==0){
            return EmptyB;
        }
        if(word.charAt(index)!=Target){
            EmptyA+=word.charAt(index);
        }else{
            EmptyB+=word.charAt(index);
        }
        return EmptyA+AddLast(word, Target, index-1);



    }
    public static void main(String[] args) {
          String word="abxghfxxx";
          System.out.println("Ans is:"+AddLast(word,'x',word.length()-1));
    }
    
}
