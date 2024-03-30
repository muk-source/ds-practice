/*
 * Problem Statement: You are given an array of prices where prices[i] is the price of a given stock on an ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock. Return the maximum profit you can achieve from this transaction.
 If you cannot achieve any profit, return 0.

 Approach is simple , we know that we have to buy first and then we can sell .
 so for example we are selling on second day{7,1,5,3,6,4}; where the price is for exmaple --> 1 , then we will 
 look to buy before that which means on left in array and that should be min 
 so here we start by saying min on first day that is 7 and we sell on second day , we calucoate the profit 
 again if we are selling on third day , we will be trying to min of  7,1. Hence we keep on
 updating the profit and min on left part.
 */

public class StockBuyAndSell {
    static int print(int arr[]) {
        int min = arr[0];
        int profit = 0;
        int n = arr.length;
        for(int i=1;i<n;i++) {
            int cost = arr[i] - min;
            profit = Math.max(cost, profit);
            min = Math.min(min,arr[i]);
        }
        return profit;
    }
    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};
        int ans = print(arr);
        System.out.println(ans);
    }
}
