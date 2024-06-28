package Stack.BuyAndSellProblem;

public class MaxProfitAtmostTwoTransaction {
    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
        maxProfitAtmostTwoTransaction(prices);
    }

    public static void maxProfitAtmostTwoTransaction(int prices[]){
        int buy1=Integer.MAX_VALUE;
        int sell1=0;

        int buy2=Integer.MAX_VALUE;
        int sell2=0;

        for(int price:prices){
            buy1=Math.min(buy1,price);
            sell1=Math.max(sell1,price-buy1);

            buy2=Math.min(buy2,price-sell1);
            sell2=Math.max(sell2,price-buy2);
        }
        System.out.println("Maximum profit: "+sell2);
    }
}
