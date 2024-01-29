package leetcode;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ContainsDuplicate {
//    217. Contains Duplicate
//    Solved
//            Easy
//    Topics
//            Companies
//    Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
//
//
//
//    Example 1:
//
//    Input: nums = [1,2,3,1]
//    Output: true
//    Example 2:
//
//    Input: nums = [1,2,3,4]
//    Output: false
//    Example 3:
//
//    Input: nums = [1,1,1,3,3,4,3,2,4,2]
//    Output: true
//
//
//    Constraints:
//
//            1 <= nums.length <= 105
//            -109 <= nums[i] <= 10
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number of items");

    int n = sc.nextInt();

    int[] arr = new int[n];
    System.out.println("enter the elements ");

    for (int i=0;i<n;i++) {
        arr[i]= sc.nextInt();
    }
    System.out.println(containsDuplicate(arr));
}

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> ans = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(ans.contains(nums[i])){
                return true;
            }
            else{
                ans.add(nums[i]);
            }
        }
        return false;
    }
}
