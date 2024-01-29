package leetcode;

import java.util.Scanner;

public class BuyAndSellStock {
//    121. Best Time to Buy and Sell Stock
//            Solved
//    Easy
//            Topics
//    Companies
//    You are given an array prices where prices[i] is the price of a given stock on the ith day.
//
//    You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
//
//    Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
//
//
//
//    Example 1:
//
//    Input: prices = [7,1,5,3,6,4]
//    Output: 5
//    Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
//    Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
//    Example 2:
//
//    Input: prices = [7,6,4,3,1]
//    Output: 0
//    Explanation: In this case, no transactions are done and the max profit = 0.
//
//
//    Constraints:
//
//            1 <= prices.length <= 105
//            0 <= prices[i] <= 10
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number of items");

    int n = sc.nextInt();

    int[] arr = new int[n];
    System.out.println("enter the elements ");

    for (int i=0;i<n;i++) {
        arr[i]= sc.nextInt();
    }
    System.out.println(maxProfit(arr));
}
    public static int maxProfit(int[] prices) {
        int max=0;
        int cheapest=prices[0];
        for(int j=0;j<prices.length;j++){
            if(prices[j]-cheapest>max){
                max=prices[j]-cheapest;
            }
            else if(prices[j]<cheapest){
                cheapest=prices[j];
            }
        }
        return max;
    }
}

