//给定一个 N 叉树，返回其节点值的层序遍历。 (即从左到右，逐层遍历)。 
//
// 例如，给定一个 3叉树 : 
//
// 
//
// 
//
// 
//
// 返回其层序遍历: 
//
// [
//     [1],
//     [3,2,4],
//     [5,6]
//]
// 
//
// 
//
// 说明: 
//
// 
// 树的深度不会超过 1000。 
// 树的节点总数不会超过 5000。 
// Related Topics 树 广度优先搜索


//leetcode submit region begin(Prohibit modification and deletion)
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result = new ArrayList();
        if (root == null) return result;
        Queue<Node> queue = new LinkedList();
        queue.offer(root);
        while(!queue.isEmpty()){
            List<Integer> levelReult = new ArrayList<>();
            //这里就要确定循环此层的次数
            int size= queue.size();
            //错误写法 while(!queue.isEmpty())或 for(int i =0 ;i<queue.size();i++)
            for(int i =0 ;i<size;i++){
                root=queue.poll();
                levelReult.add(root.val);
                queue.addAll(root.children);
            }
            result.add(levelReult);
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
