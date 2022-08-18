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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> traversal = new ArrayList<>();
        preorder(root, traversal);
        return traversal;
    }
    
    private void preorder(TreeNode root, List<Integer> traversal) {
        if(root != null){
            traversal.add(root.val);
            if(root.left!=null){
                preorder(root.left, traversal);
            }
            if(root.right!=null){
                preorder(root.right, traversal);
            }
        }
    }
}