class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 1;
        int n= 1;

        for(int i =1;i<nums.length;i++){
            if(nums[i]==nums[i-1] && n!=0){
                nums[count] = nums[i];
                count++;
                n--;
            }
            else if(nums[i]!=nums[i-1]){
                n=2;
                nums[count]=nums[i];
                count++;
                n--;
            }
        }

        return count;
    }
}