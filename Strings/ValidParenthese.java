package Strings;

import java.util.Stack;

public class ValidParenthese {
    public static void main(String[] args) {
        String s = "()[]{}";

        ValidParenthese checker=new ValidParenthese();
        System.out.println("Ans is:"+checker.isValid(s));

        
    }
    public  boolean isValid(String s) {
        Stack<Character> Stack=new Stack<Character>();
        for(int i=0;i<s.length();i++){
            char current=s.charAt(i);
            if(IsOpening(current)){
                Stack.push(current);
            }else{
                if(s.isEmpty()){
                    return false;
                }
                else if(!IsMatching(Stack.peek(),current)){
                    return false;
                }else{
                    Stack.pop();
                }
            }
        }
        return s.isEmpty();
        
    }

    boolean IsOpening(char c){
        return c=='(' || c=='{' || c=='[';
    }
    
    boolean IsMatching(char a,char b){
        return (a=='(' && b==')') || (a=='[' && b==']') || (a=='{' && b=='}');
    }
}
