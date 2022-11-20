package Recursion;

public class FindFirstAndLastOccurranceFromString {

    public static void FirstOccurance(String word,int length,char Target){

        // Base Condition
        if(length<=-1){
            return;
        }
        if(word.charAt(length)==Target){
            System.out.println("Character from last index:"+length);
            return;
        }
        FirstOccurance(word, length-1, Target);


        
    }
    public static void LastOccurance(String word,int length,char Target,int index){

        // Base Condition
        if(length==index){
            return;
        }
        if(word.charAt(index)==Target){
            System.out.println("Character from first index:"+index);
            return;
        }
        LastOccurance(word, length, Target,index+1);

    }
    public static void main(String[] args) {
        String word="abcdefbcda";
        int length=word.length()-1;
        char Target='d';
        int index=0;
        FirstOccurance(word,length,Target);
        LastOccurance(word, length, Target,index);
    }
    
}
