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
    public TreeNode rev(TreeNode root){
        if(root==null)return root;
        TreeNode leftR=root.left;
        TreeNode rightR=root.right;
        root.left=rev(rightR);
        root.right=rev(leftR);
        return root;

    }
    public boolean isSymmetric(TreeNode root) {
        root.left=rev(root.left);
        return isSame(root.left,root.right);
        

    }
    public boolean isSame(TreeNode l,TreeNode r){
        if(r==null&&l==null) return true;
        if(l==null||r==null) return false;
        if(l.val!=r.val)return false;
        return isSame(l.left,r.left)&&isSame(l.right,r.right);
    }
}