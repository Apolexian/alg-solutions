/**
Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).

For example:
Given binary tree [3,9,20,null,null,15,7],

    3
   / \
  9  20
    /  \
   15   7

return its level order traversal as:

[
  [3],
  [9,20],
  [15,7]
]
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
    // Time complexity: O(n) where n is number of elements
    // Space complexity: O(n) where n is number of elements
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> graphList = new  LinkedList<>();
        Queue <TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int level = 0;
        
        while(!queue.isEmpty()) {
            List<Integer> levelList = new LinkedList<>();
            
            int size = queue.size();
            
            for(int i = 0; i < size; i++){
                TreeNode node = queue.poll();
                
                if(node != null){
                    levelList.add(node.val);
                    queue.add(node.left);
                    queue.add(node.right);  
                }
            }
            
            if(levelList.size() > 0) {
                graphList.add(levelList);
            }
            
        }
        return graphList;
    }
}