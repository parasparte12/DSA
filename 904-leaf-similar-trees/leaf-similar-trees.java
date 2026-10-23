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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leav1=new ArrayList<>();
        List<Integer> leav2=new ArrayList<>();
        
        searchLeav(root1,leav1);
        searchLeav(root2,leav2);
        return leav1.equals(leav2);
    }
    private void searchLeav(TreeNode node,List<Integer> leave){

        if(node==null) return;
        if(node.left==null && node.right==null){
            leave.add(node.val);
            return;
        }
        searchLeav(node.left,leave);
        searchLeav(node.right,leave);
    }
}