package Stack;

import java.util.Stack;

public class ReverseStringUsingStack {
    public static String ReverseString(String str){
        char[] reverseString=new char[str.length()];

        // creating a string
        Stack<Character> stack=new Stack<Character>();
        for(int i=0;i<str.length();i++){
            stack.push(str.charAt(i));
        }

        // creating reverse array
        int i=0;
        while(!stack.isEmpty()){
            reverseString[i++]=stack.pop();
        }

        // printing array
        String ReverseStringg="";
        for(int j=0;j<str.length();j++){
            ReverseStringg+=reverseString[j];

        }

        return ReverseStringg;
    }
    public static void main(String[] args) {
        ReverseStringUsingStack ReverseStringOBJ=new ReverseStringUsingStack();
        System.out.println("Ans is:"+ReverseStringOBJ.ReverseString("vivekGupta"));
        
    }
    
}
