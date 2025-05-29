public class bestbuyorsell {
    public int maxProfit(int[] prices) {
        int buy = prices[0]; //tracks lowest price so far
        int profit = 0; //tracks max prifit found so far

        for (int i=1; i<prices.length; i++) { // loop from day 1
            if (prices[i]<buy){ //if today's price is lower than before, update lowest price found thus far
                buy = prices[i];
            }
            else if (prices[i] - buy>profit) { //if today's price - the curr buy results in a greater profit, update profit
            profit = prices[i] - buy;
        }
    }
    return profit;
}
}
