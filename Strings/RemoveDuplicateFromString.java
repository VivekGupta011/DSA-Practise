package Strings;

public class RemoveDuplicateFromString {

    public static void RemoveDuplicate(String word){
        int index=0;
        String Result="";
        System.out.println("Original String:"+word);

        for(int i=0;i<word.length();i++){
            for(int j=0;j<word.length();j++){
                if(i!=j){
                    if(word.charAt(i)==word.charAt(j)){
                        index++;
                    }
                }
            }
            if(index==0 || index==1){
                Result=Result+word.charAt(i);
            }else{
                index=0;
            }
        }

        System.out.println("Ans is:"+Result);

    }
    public static void main(String[] args) {
        RemoveDuplicate("abcdfehhf");
    }
}
