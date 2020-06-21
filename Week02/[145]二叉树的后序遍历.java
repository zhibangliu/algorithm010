//给定一个二叉树，返回它的 后序 遍历。 
//
// 示例: 
//
// 输入: [1,null,2,3]  
//   1
//    \
//     2
//    /
//   3 
//
//输出: [3,2,1] 
//
// 进阶: 递归算法很简单，你可以通过迭代算法完成吗？ 
// Related Topics 栈 树


//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        //使用迭代实现
        LinkedList<Integer> list = new  LinkedList();
        if(root==null) return list;
        Deque<TreeNode> queue = new LinkedList();
        queue.addFirst(root);
        while (!queue.isEmpty()){
            TreeNode node=queue.pollFirst();
            if (node.left != null) {
                queue.addFirst(node.left);
            }
            if (node.right != null) {
                queue.addFirst(node.right);
            }
            list.addFirst(node.val);
        }
        return list;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
