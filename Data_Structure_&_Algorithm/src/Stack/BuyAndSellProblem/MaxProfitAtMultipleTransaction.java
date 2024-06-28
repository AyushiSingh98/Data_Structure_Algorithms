package Stack.BuyAndSellProblem;

public class MaxProfitAtMultipleTransaction {
    public static void main(String[] args) {
        //int prices[]={7,1,5,3,6,4};
        int prices[]={5,2,6,1,4,7,3,6};

        MaxProfitAtMultipleTransaction.MaxProfitAtMultiple(prices);

    }

    public static void MaxProfitAtMultiple(int prices[]){
        int buy=Integer.MAX_VALUE;
        int sell=0;
        int maxProfit=0;
        for(int price:prices){
            buy=Math.min(buy,price);
            sell=price;
            if(sell>buy){
                maxProfit+=sell-buy;
                buy=price;
            }
        }
        System.out.println("Maximum profit: "+maxProfit);
    }
}
