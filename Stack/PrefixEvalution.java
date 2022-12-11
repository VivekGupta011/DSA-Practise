package Stack;
import java.util.Stack;

public class PrefixEvalution {
    public static int PrefixTesting(String str){
        Stack<Integer> stack=new Stack<>();
        int charAt;
        for(int i=str.length()-1;i>=0;i--){

            // conversion of char to int
            charAt=Character.getNumericValue(str.charAt(i));
            if(charAt>='0' && charAt<='9'){
                stack.push(charAt);
            }else{
                int op1=stack.peek();
                stack.pop();
                int op2=stack.peek();
                stack.pop();
                switch(str.charAt(i)){
                    case '+':
                    stack.push(op1+op2);
                    break;
                    case '-':
                    stack.push(op1-op2);
                    break;
                    case '*':
                    stack.push(op1*op2);
                    break;
                    case '^':
                    stack.push((int) Math.pow(op1,op2));
                }
            }
        }
        return stack.peek();

    }
    public static void main(String[] args) {
        String str="-+7*45+20";
        System.out.println("Ans is:"+PrefixTesting(str));
        
    } 
    
}
