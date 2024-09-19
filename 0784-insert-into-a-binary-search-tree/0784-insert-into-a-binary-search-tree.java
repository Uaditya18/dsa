/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
       
        
       root =  InsertNode(root, val);
        return root;
    }

    public TreeNode InsertNode(TreeNode temp, int val){
        
        if(temp==null){
            
                return new TreeNode(val);
            
        }
        else{
            if(val<temp.val){
           temp.left = InsertNode(temp.left, val);
            }else{
            temp.right = InsertNode(temp.right, val);
            }
        }
        return temp;
    }
}