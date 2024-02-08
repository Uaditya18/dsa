package leetcode;

import java.util.Scanner;

public class buyandsell2 {
//    122. Best Time to Buy and Sell Stock II
//    Attempted
//            Medium
//    Topics
//            Companies
//    You are given an integer array prices where prices[i] is the price of a given stock on the ith day.
//
//    On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the stock at any time. However, you can buy it then immediately sell it on the same day.
//
//    Find and return the maximum profit you can achieve.
//
//
//
//    Example 1:
//
//    Input: prices = [7,1,5,3,6,4]
//    Output: 7
//    Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
//    Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
//    Total profit is 4 + 3 = 7.
//    Example 2:
//
//    Input: prices = [1,2,3,4,5]
//    Output: 4
//    Explanation: Buy on day 1 (price = 1) and sell on day 5 (price = 5), profit = 5-1 = 4.
//    Total profit is 4.
//    Example 3:
//
//    Input: prices = [7,6,4,3,1]
//    Output: 0
//    Explanation: There is no way to make a positive profit, so we never buy the stock to achieve the maximum profit of 0.
//
//
//    Constraints:
//
//            1 <= prices.length <= 3 * 104
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
    System.out.println( maxProfit(arr));
}
    public static int maxProfit(int[] prices) {
        int n = prices.length;
        int[] row = new int[n+1];
        row[0]=0;
        int[][] k = new int[n+1][n+1];
        int max=0;
        int maxpro=0;
        for(int i=1;i<n+1;i++){
            k[i][0]=0;
            k[0][i]=0;
            row[i]=prices[i-1];
        }
        for(int i=1;i<n+1;i++){
            for(int j=i;j<n+1;j++){
                if(row[i-1]>row[i]){
                    max=Math.max(k[i-1][j],k[i][j-1]);
                    k[i][j]=Math.max(k[i-1][j-1]+row[j]-row[i],max);
                    maxpro=k[i][j];
                }else{
                    max=Math.max(k[i-1][j],k[i][j-1]);
                    k[i][j]=Math.max(row[j]-row[i],max);
                    maxpro=k[i][j];
                }


            }
        }
        for(int i=0;i<n+1;i++){
            for(int j=0;j<n+1;j++){
                System.out.print(k[i][j]);
            }
            System.out.println();
        }

        return maxpro;
    }
}
