class Solution {
    public int majorityElement(int[] nums) {
        int a = nums[0];
        int count = 1;

        for(int i =1;i<nums.length;i++){
            if(nums[i]==a){
                count++;
            }
            else if(count==0 && nums[i]!=a){
                a = nums[i];
                count ++;
            }
            else{
                count--;
            }
        }
        return a ;
    }
}