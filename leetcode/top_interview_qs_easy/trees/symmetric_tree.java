/**
Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).

For example, this binary tree [1,2,2,3,4,4,3] is symmetric:

    1
   / \
  2   2
 / \ / \
3  4 4  3

 

But the following [1,2,2,null,3,null,3] is not:

    1
   / \
  2   2
   \   \
   3    3

 

Follow up: Solve it both recursively and iteratively.
*/

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
    // Recursive approach
    // Time complexity: O(n)
    // Space complexity: O(n)
    public boolean isSymmetric(TreeNode root) {
       return isSymmetric(root, root);
    }
    
    private boolean isSymmetric(TreeNode nodeOne, TreeNode nodeTwo) {
        if(nodeOne == null && nodeTwo == null) {return true;}
        if(nodeOne == null || nodeTwo == null) {return false;}
        
        return (nodeOne.val == nodeTwo.val) 
            && isSymmetric(nodeOne.right, nodeTwo.left)
            && isSymmetric(nodeOne.left, nodeTwo.right);
    }
}