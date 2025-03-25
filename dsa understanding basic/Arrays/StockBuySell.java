import java.util.*;

class BestTime
{
    void buySell(int[] array)
    {
        /*
         * You are given an array prices where prices[i] represents the price of a given stock on the ith day. Your task is to determine the maximum profit that can be achieved by performing the following:

        Buy the stock on one day.
        Sell the stock on another day after the buying day.
         */
        int maxProfit=0, minPrice= Integer.MAX_VALUE;
        if (array == null || array.length <= 1) {
            System.out.println(0);
            return;
        }
        for(int i=0;i<array.length;i++)
        {
            int currentProfit=0;
            int currentPrice = array[i];
            if(currentPrice<minPrice)
            {
                minPrice = currentPrice; 
            }
            currentProfit = currentPrice-minPrice;
            maxProfit = Math.max(maxProfit,currentProfit);
        }
        System.out.println(maxProfit);
    }

    // This is a bit different method to buy and sell stocks
        
        public static int maxProfit(int[] array) {
            int totalProfit = 0;
    
            // Loop through the prices array
            for (int i = 1; i < array.length; i++) {
                // If the current price is greater than the previous price, it's a profit
                if (array[i] > array[i - 1]) {
                    totalProfit += array[i] - array[i - 1];
                }
            }
    
            return totalProfit;
            /*
         * Input: prices = [7,1,5,3,6,4]
            Output: 7
            Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
            Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
            Total profit is 4 + 3 = 7.
         */
        }
}
public class StockBuySell 
{
    public static void main(String args[])
    {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the No of days ");
        int n = x.nextInt();
        int[] StockArray = new int [n];
        System.out.println("Enter the Stock prices for each day");

        for(int i=0;i<n;i++)
        {
            StockArray[i]= x.nextInt();
        }

        System.out.println("The stock prices for each day are:");
        for(int i=0;i<n;i++)
        {
            System.out.println(StockArray[i]);
        }
            BestTime b = new BestTime();
            b.buySell(StockArray);
            b.maxProfit(StockArray);
    }    
}
