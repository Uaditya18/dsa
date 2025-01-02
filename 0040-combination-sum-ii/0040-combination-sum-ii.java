class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        Arrays.sort(candidates);
        findCombination(0,target,candidates,result,list);
        return result;
    }

    public void findCombination(int ind, int sum,int[] nums,List<List<Integer>> result,List<Integer> list){
        if(sum == 0){
            result.add(new ArrayList<>(list));
            return;
        }

        for(int i=ind;i<nums.length;i++){
            if(i>ind && nums[i]==nums[i-1]) continue;
            if(nums[i]>sum) break;

            list.add(nums[i]);
            findCombination(i+1,sum-nums[i],nums,result,list);
            list.remove(list.size()-1);
        }
    }
}