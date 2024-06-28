package Stack.BuyAndSellProblem;

public class MaxProfitAtSingleTransaction {
    public static void main(String[] args) {
     // int prices[]={7,1,5,3,6,4};
     //   int prices[]={7,6,4,3,1};
        int prices[]={1,2,3,0,2};


        MaxProfitAtSingleTransaction.maxProfitAtSingle(prices);
    }

    public static void maxProfitAtSingle(int prices[]){
        int buy=Integer.MAX_VALUE;
        int sell=0;
        for(int price:prices){
            buy=Math.min(buy,price);
            sell=Math.max(sell,price-buy);
        }
        System.out.println("Maximum Profit: "+sell);
    }
}
