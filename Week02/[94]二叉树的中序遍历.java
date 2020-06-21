//给定一个二叉树，返回它的中序 遍历。 
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
//输出: [1,3,2] 
//
// 进阶: 递归算法很简单，你可以通过迭代算法完成吗？ 
// Related Topics 栈 树 哈希表


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
    public List<Integer> inorderTraversal(TreeNode root) {
        //左-中-右
        List<Integer> list = new ArrayList();
        Deque<TreeNode> stack =  new TreeNode();
        TreeNode curr =root;
        while(!stack.isEmpty()||curr!=null){
            while(curr!=null){
                stack.offerFirst(curr);
                curr=curr.left;
            }
            curr = stack.pollFirst();
            list.add(curr.val);
            curr=curr.right;
        }
        return list;
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Deque<TreeNode> stack = new ArrayDeque<>();
        TreeNode p = root;
        while(!stack.isEmpty() || p != null) {
            if(p!=null){
                stack.push(p);
                p=p.left;
            }else{
                TreeNode node = stack.pop();
                List.add(node.val); // Add after all left children
                p=p.right;
            }
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
