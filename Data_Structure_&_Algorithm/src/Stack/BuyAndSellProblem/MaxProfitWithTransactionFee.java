package Stack.BuyAndSellProblem;

public class MaxProfitWithTransactionFee {
    public static void main(String[] args) {
        int prices[]={1,3,2,8,4,9};
        int fee=2;
        System.out.println("Maximum profit with transaction fee:"+getMaxProfitWithTransactionFee(prices,fee));
    }

    public static int getMaxProfitWithTransactionFee(int prices[],int fee){
        int buy=Integer.MAX_VALUE;
        int sell=0;

        for(int price : prices){
            buy=Math.min(buy,price-sell);
            sell=Math.max(sell,price-buy-fee);
        }
        return sell;
    }
}
