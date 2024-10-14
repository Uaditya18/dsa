class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];
        int n = nums.length;

        prefix[0] = 1;
        suffix[0] = 1;

        for(int i=1;i<nums.length;i++){
            prefix[i] = prefix[i-1]*nums[i-1];

        }

        for(int i=1;i<nums.length;i++){
            suffix[i] = suffix[i-1]*nums[n-i];

        }


        for(int i=0;i<nums.length;i++){
            prefix[i] = prefix[i]*suffix[n-i-1];
        }

        return prefix;
    }
}