class Solution {
    public void moveZeroes(int[] nums) {
        

        int counter =0;
        
            for(int i=0;i<nums.length;i++){
                if(nums[i]==0){
                    counter++;
                
                int nonZero =i;
                while(nonZero<nums.length-1 && nums[nonZero]==0){
                    nonZero++;
                }
                nums[i] = nums[nonZero];
                nums[nonZero]=0;
            }
        }
    }
}