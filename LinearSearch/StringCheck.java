package LinearSearch;

import java.lang.annotation.Target;
import java.util.Arrays;

public class StringCheck {
    public static void main(String[] args) {
        String name="VivekGupta";
        char target;
        StringCheck bb=new StringCheck();
        // bb.CharacterCheck(name,target='G');
        System.out.println(Arrays.toString(name.toCharArray()));

    }

    public boolean CharacterCheck(String name,char target){
        if(name.length()==0){
            return false;
        }
        // for(int i=0;i<name.length();i++){
        //     if(name.charAt(i)==target){
        //         System.out.println("Character present "+name.charAt(i));
        //         return true;
        //     }
        // }
        for(char Each:name.toCharArray()){


        }
        return false;
    }
    
}
