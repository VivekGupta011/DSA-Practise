package Arrays;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] prices={7,1,5,6,4};
        System.out.println("Ans is:"+maxProfit(prices));


        
    }
    public static int maxProfit(int[] prices) {
       
        if(prices == null || prices.length == 0) return 0;
        int min = prices[0];
        int max = Integer.MIN_VALUE;
        
        for(int i = 0; i < prices.length; i++){
            int money = prices[i] - min;
            if(money > max){
                max = money;
            }
            if(prices[i] < min){
                min = prices[i];
            }
        }
        
        return max;
        
        
    }
    
}
