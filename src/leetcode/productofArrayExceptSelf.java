package leetcode;

import java.util.Scanner;

public class productofArrayExceptSelf {
//    238. Product of Array Except Self
//            Solved
//    Medium
//            Topics
//    Companies
//    Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
//
//    The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
//
//    You must write an algorithm that runs in O(n) time and without using the division operation.
//
//
//
//    Example 1:
//
//    Input: nums = [1,2,3,4]
//    Output: [24,12,8,6]
//    Example 2:
//
//    Input: nums = [-1,1,0,-3,3]
//    Output: [0,0,9,0,0]
//
//
//    Constraints:
//
//            2 <= nums.length <= 105
//            -30 <= nums[i] <= 30
//    The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
//
//
//    Follow up: Can you solve the problem in O(1) extra space complexity? (The output array does not count as extra space for space complexity analysis.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of items");

        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("enter the elements ");

        for (int i=0;i<n;i++) {
            arr[i]= sc.nextInt();
        }
        arr=productExceptSelf(arr);
        for (int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }

    }
        public static int[] productExceptSelf(int[] nums) {
            int[] ans = new int[nums.length];
            ans[0]=1;
            for(int i=1;i<nums.length;i++){
                ans[i]=ans[i-1]*nums[i-1];
            }
            int temp=1;
            for(int i=nums.length-1;i>=0;i--)
            {
                ans[i]=ans[i]*temp;
                temp=temp*nums[i];
            }
            return ans;
        }
    }

