package Stack;

import java.util.Stack;

public class EvaluateReversePolishNotationLeetcode {
    public static int evalRPN(String[] tokens) {
        int a,b;
        Stack<Integer> S=new Stack<>();
        for(String ch:tokens){
            if(ch.equals("+")){
                S.push(S.pop()+S.pop());
            }else if(ch.equals("/")){
                b=S.pop();
                a=S.pop();
                S.push(a/b);
            }else if(ch.equals("-")){
                b=S.pop();
                a=S.pop();
                S.push(a-b);
            }else if(ch.equals("*")){
                S.push(S.pop()*S.pop());

            }
            else{
                S.push(Integer.parseInt(ch));
            }
        }
        return S.pop();
    }
 

  // Driver program to test above functions
  public static void main(String[] args) {
    String[] array={"2","1","+","3","*"};
    System.out.println("Ans is:"+evalRPN(array));
    
  }
    
}
