class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];
        int[] result = new int[nums.length];
        prefix[0] = 1;
        suffix[0] = 1;

        for(int i=1;i<nums.length;i++){
            prefix[i] = prefix[i-1]*nums[i-1];
            suffix[i] = nums[nums.length-i]*suffix[i-1];
        }

        for(int i=0;i<nums.length;i++){
            result[i] = prefix[i]*suffix[nums.length-i-1];
        }
        return result;
    }
}