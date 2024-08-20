class Solution {
    public int maxProduct(int[] nums) {
        double curprod=1;
        double maxprod=Integer.MIN_VALUE;


        
        for(int i=0;i<nums.length;i++){
            curprod = curprod *nums[i];

            maxprod = Math.max(curprod,maxprod);
            
            if(curprod==0){
                curprod=1;
            }
            
        }
        curprod =1;

         for(int i=nums.length-1;i>=0;i--){
            curprod = curprod *nums[i];

            maxprod = Math.max(curprod,maxprod);
            
            if(curprod==0){
                curprod=1;
            }
            
        }
        return (int)maxprod;
    }
}