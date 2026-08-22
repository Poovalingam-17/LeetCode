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
    public static int sum(TreeNode node,int low,int high,int sum){
        if(node == null){
            return sum;
        }
        if(node.val<=high && node.val>=low){
            sum+=node.val;
        }
        sum = sum(node.left,low,high,sum);
        sum = sum(node.right,low,high,sum);
        return sum;
    }
    public int rangeSumBST(TreeNode root, int low, int high) {
        return sum(root,low,high,0);
    }
}