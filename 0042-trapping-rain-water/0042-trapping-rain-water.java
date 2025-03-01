class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int leftMax = height[0], rightMax = height[n-1], ans =0;
        int[] prefixMax = new int[n];
        int[] sufixMax = new int[n];
        prefixMax[0] = height[0];
        sufixMax[n-1] = height[n-1];
        for(int i =1;i<n;i++){
            prefixMax[i] = Math.max(prefixMax[i-1],height[i]);
        }

        for(int i = n-2;i>=0;i--){
            sufixMax[i] = Math.max(sufixMax[i+1],height[i]);
        }
        
        for(int i =0;i<n;i++){
            leftMax = prefixMax[i];
            rightMax = sufixMax[i];

            if(height[i]<leftMax && height[i]<rightMax){
                ans += Math.min(leftMax,rightMax)-height[i];
            }
        }
        return ans;
    }
}