//给定一个 N 叉树，返回其节点值的前序遍历。 
//
// 例如，给定一个 3叉树 : 
//
// 
//
// 
//
// 
//
// 返回其前序遍历: [1,3,5,6,2,4]。 
//
// 
//
// 说明: 递归法很简单，你可以使用迭代法完成此题吗? Related Topics 树


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

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

class Solution {
    //需要多些几遍
    List<Integer> list = new ArrayList();
    public List<Integer> preorder(Node root) {
        if (root == null)
            return list;

        list.add(root.val);
        for(Node node: root.children)
            preorder(node);

        return list;
    }
    //方法2
    //需要多写几遍
//前序遍历，自己-左-右
    public List<Integer> preorder(Node root) {
        List<Integer> list = new ArrayList();
        if (root == null) return list;
        Deque<Node> deque = new LinkedList();
        deque.add(root);
        while(!deque.isEmpty()){
            root=deque.pollFirst();
            list.add(root.val);
            for (int i = root.children.size()-1; i >=0; i--) {
                deque.offerFirst(root.children.get(i));
            }
        }
        return  list;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
