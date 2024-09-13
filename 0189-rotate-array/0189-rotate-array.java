class Solution {
    public void rotate(int[] nums, int k) {
        int[] result = new int[nums.length];

        for(int i=0;i<nums.length;i++){
            int newPosition = (i+k)%(nums.length);
            result[newPosition] = nums[i]; 
        }

        for(int i=0;i<nums.length;i++)
        {
            nums[i] = result[i];
        }
    }
}