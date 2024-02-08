package leetcode;

import java.util.Scanner;

public class jumpNumbers {
//    55. Jump Game
//    Solved
//            Medium
//    Topics
//            Companies
//    You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.
//
//    Return true if you can reach the last index, or false otherwise.
//
//
//
//            Example 1:
//
//    Input: nums = [2,3,1,1,4]
//    Output: true
//    Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
//            Example 2:
//
//    Input: nums = [3,2,1,0,4]
//    Output: false
//    Explanation: You will always arrive at index 3 no matter what. Its maximum jump length is 0, which makes it impossible to reach the last index.
//
//
//            Constraints:
//
//            1 <= nums.length <= 104
//            0 <= nums[i] <= 10
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number of items");

    int n = sc.nextInt();

    int[] arr = new int[n];
    System.out.println("enter the elements ");

    for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
    }
    System.out.println(canJump(arr));
}
    public static boolean canJump(int[] nums) {
        int n= nums.length;
        int flag=n-1;

        for(int i=n-1;i>=0;i--)
        {
            if(i+nums[i]>=flag){
                flag=i;
            }
        }
        return flag==0;
    }
}
