class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int  n=nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            if(i>0&&nums[i]==nums[i-1]){
                continue;
            }
            int target= 0-(nums[i]);
            int k=n-1;
            int j=i+1;

            while(j<k){
                int sum=nums[j]+nums[k];
                if(sum==target){
                    List<Integer> ans1=new ArrayList<>();
                    ans1.add(nums[i]);
                    ans1.add(nums[j]);
                    ans1.add(nums[k]);
                    ans.add(ans1);
                    j++;
                    k--;

                    while (j < k && nums[j] == nums[j - 1]) j++;
                    while (j < k && nums[k] == nums[k + 1]) k--;
                }
                if(sum<target){
                    j++;
                }
                else if(sum>target){
                    k--;
                }
            }
        }
        return ans;
    }
}