class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int cnt1 =0 ,cnt2 = 0;
        int el1=Integer.MIN_VALUE ,el2 = Integer.MIN_VALUE;

        List<Integer> result = new ArrayList<>();

        for(int i =0;i<nums.length;i++){
            if(nums[i]==el1){
                cnt1++;
            }
            if(nums[i]==el2){
                cnt2++;
            }
            if(cnt1==0 && nums[i]!=el2){
                el1=nums[i];
                cnt1=1;
            }
            if(cnt2 ==0 && nums[i]!=el1){
                el2=nums[i];
                cnt2=1;
            }
            
            if(nums[i]!=el2 && nums[i]!=el1){
                cnt1--;
                cnt2--;
            }
        }

        

        cnt1 = cnt2 = 0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==el1){
                cnt1++;
            }
            if(nums[i]==el2){
                cnt2++;
            }
        }
        int n = nums.length / 3;

        if (cnt1 > n) {
            result.add(el1);
        }

        if (cnt2 > n && !result.contains(el2)) {
            result.add(el2);
        }

        

        return result;
    }
}