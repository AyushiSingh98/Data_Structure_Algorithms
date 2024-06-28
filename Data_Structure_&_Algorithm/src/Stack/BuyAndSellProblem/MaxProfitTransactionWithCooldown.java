package Stack.BuyAndSellProblem;

public class MaxProfitTransactionWithCooldown {
    public static void main(String[] args) {
        //{7,1,5,3,6,4};{1,2,3,0,2},{1}
        int prices[]={7,6,4,3,1};
        System.out.println("Maximum profit:"+maxProfitTransactionWithCooldown(prices));
    }

    public static int maxProfitTransactionWithCooldown(int prices[]){
        int buy=Integer.MAX_VALUE;
        int sell=0;
        int CDP=0;
        for(int price:prices){
            buy=Math.min(buy,price-CDP);
            CDP=Math.max(sell,CDP);
            sell=Math.max(sell,price-buy);
        }
        if(sell>CDP)
            return sell;
        else
            return CDP;
    }
}
