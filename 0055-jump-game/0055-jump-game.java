class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int goalPoint = n-1;

        for(int i=n-1;i>=0;i--){
            if(i+nums[i]>=goalPoint){
                goalPoint = i;
            }
        }

        return goalPoint==0? true : false;
    }
}