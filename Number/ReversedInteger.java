package Number;

public class ReversedInteger {

    public static int reverse(int x) {
        String reversedNum = "";
        boolean negative=false;
        int result;
        if(x<0){
            x=x*-1;
            negative=true;
        }
        while (x > 0) {
            int num = x % 10;
            // corner case
            if(num!=0){
                reversedNum = reversedNum + num;
            }
            x = x / 10;
        }
        if(negative){
            result=Integer.parseInt(reversedNum);
            result=result*-1;
            return result;
        }
        if(!negative){
            result=Integer.parseInt(reversedNum);
            return result;
        }

        return -1;
       
        
    }
    public static void main(String[] args) {
        // System.out.println("Ans is:"+reverse(120007));
        System.out.println("Ans is:"+reverse(3450));
       
         
    }

}
