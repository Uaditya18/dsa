package leetcode;

import java.util.Scanner;

public class TwoSum {
//    1. Two Sum
//    Solved
//            Easy
//    Topics
//            Companies
//    Hint
//    Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//
//    You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//    You can return the answer in any order.
//
//
//
//            Example 1:
//
//    Input: nums = [2,7,11,15], target = 9
//    Output: [0,1]
//    Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
//    Example 2:
//
//    Input: nums = [3,2,4], target = 6
//    Output: [1,2]
//    Example 3:
//
//    Input: nums = [3,3], target = 6
//    Output: [0,1]
//
//
//    Constraints:
//
//            2 <= nums.length <= 104
//            -109 <= nums[i] <= 109
//            -109 <= target <= 109
//    Only one valid answer exists.
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number of items");

    int n = sc.nextInt();

    int[] arr = new int[n];
    System.out.println("enter the elements ");

    for (int i=0;i<n;i++) {
        arr[i]= sc.nextInt();
    }
    System.out.println("choose a target number");
    int target= sc.nextInt();
    int[] ans=twoSum(arr,target);
    System.out.println("["+ans[0]+","+ans[1]+"]");
}

    public static int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];

        for(int i=1;i<nums.length;i++){

            for(int j=0;i+j<nums.length;j++){
                if((nums[j]+nums[i+j])==target){
                    ans[0]=j;
                    ans[1]=i+j;
                    return ans;
                }
            }
        }
        return ans;
    }
}
