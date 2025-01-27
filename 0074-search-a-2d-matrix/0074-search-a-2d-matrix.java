class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        boolean ans = false;

        int i =0;
        int left =0;
        int right = matrix[0].length-1;

        while(i<matrix.length && matrix[i][right]<target){
            i++;
        }

        while(i<matrix.length && left<=right){
            int mid = (left+right)/2;
            if(matrix[i][mid]==target){
                ans = true;
                return ans;
            }
            else if(matrix[i][mid]<target){
                left=mid+1;
            }
            else{
                right = mid-1;
            }
        }


        return ans;
    }
}