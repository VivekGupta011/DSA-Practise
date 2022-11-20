package Recursion;

public class AddTargetCharacterAtLast {

    public static void AddLast(String word,char Target){
        String EmptyA="";
        String EmptyB="";
        for(int index=0;index<word.length();index++){
            if(word.charAt(index)!=Target){
                EmptyA=EmptyA+word.charAt(index);
            }else{
                EmptyB=EmptyB+word.charAt(index);

            }
            
        }
        String result=EmptyA+EmptyB;
        System.out.println("Result:"+result);
        



    }
    public static void main(String[] args) {

        AddLast("abxghfxxx",'x');
        
    }
    
}
