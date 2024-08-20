class Solution {
    public int findMin(int[] nums) {
        
       int min = 999;

       int low = 0;
       int high = nums.length-1;
        int mid =0;
       while(low<=high){
         mid = low + (high-low)/2;
        if(nums[mid]<min){
            min = nums[mid];
        }
        if(nums[low]<=nums[mid]){
            if(nums[low]>=nums[high]){
                low = mid+1;
            }
            else{
                high = mid;
            }
        }
        else{
            high = mid;
        }
       }
       return min;
    }
}