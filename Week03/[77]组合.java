//给定两个整数 n 和 k，返回 1 ... n 中所有可能的 k 个数的组合。 
//
// 示例: 
//
// 输入: n = 4, k = 2
//输出:
//[
//  [2,4],
//  [3,4],
//  [2,3],
//  [1,2],
//  [1,3],
//  [1,4],
//] 
// Related Topics 回溯算法


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        getAns(1,n, k, new ArrayList<Integer>(), ans);
        return ans;
    }
    private void getAns(int start, int n, int k, ArrayList<Integer> temp,List<List<Integer>> ans) {
        if(temp.size()==k){
            ans.add(new ArrayList<Integer>(temp));
            return;
        }
        for (int i =start;i<= n - (k -temp.size()) + 1;i++){
            temp.add(i);
            getAns(i+1,n, k, temp, ans);
            //将当前数字删除，进入下次 for 循环
            temp.remove(temp.size() - 1);
        }

    }
}
//leetcode submit region end(Prohibit modification and deletion)
