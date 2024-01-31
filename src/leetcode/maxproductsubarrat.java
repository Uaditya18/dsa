package leetcode;

import java.util.Scanner;

public class maxproductsubarrat {
//    52. Maximum Product Subarray
//            Solved
//    Medium
//            Topics
//    Companies
//    Given an integer array nums, find a
//    subarray
//    that has the largest product, and return the product.
//
//    The test cases are generated so that the answer will fit in a 32-bit integer.
//
//
//
//    Example 1:
//
//    Input: nums = [2,3,-2,4]
//    Output: 6
//    Explanation: [2,3] has the largest product 6.
//    Example 2:
//
//    Input: nums = [-2,0,-1]
//    Output: 0
//    Explanation: The result cannot be 2, because [-2,-1] is not a subarray.
//
//
//    Constraints:
//
//            1 <= nums.length <= 2 * 104
//            -10 <= nums[i] <= 10
//    The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number of items");

    int n = sc.nextInt();

    int[] arr = new int[n];
    System.out.println("enter the elements ");

    for (int i=0;i<n;i++) {
        arr[i]= sc.nextInt();
    }
    System.out.println( maxProduct(arr));
}
    public static int maxProduct(int[] nums) {
        int curprod;
        int total=-999;

        for(int i=0;i<nums.length;i++){
            curprod=nums[i];
            for(int j=i;j<nums.length;j++){
                if(i!=j){
                    curprod = curprod*nums[j];
                }

                if(curprod>total){
                    total=curprod;
                }
            }
        }
        return total;
    }
}
