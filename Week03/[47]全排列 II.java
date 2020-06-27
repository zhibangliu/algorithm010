//给定一个可包含重复数字的序列，返回所有不重复的全排列。 
//
// 示例: 
//
// 输入: [1,1,2]
//输出:
//[
//  [1,1,2],
//  [1,2,1],
//  [2,1,1]
//] 
// Related Topics 回溯算法


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        permuteUnique1(nums,used,new ArrayList<Integer>(),result);
        return  result;
    }

    private void permuteUnique1(int[] nums, boolean[] used, ArrayList<Integer> temp,List<List<Integer>>  result) {
        //终止条件
        if(temp.size()==nums.length){
            result.add(new ArrayList<>(temp));
            return;
        }
        //开始递归
        for (int i = 0; i < nums.length; i++) {
            //如果使用过，continue
            if(used[i]) continue;
            // 剪枝条件：i > 0 是为了保证 nums[i - 1] 有意义
            //前一个使用过，在深度优先遍历的过程中刚刚被撤销选择
            if(i>0&&nums[i]==nums[i-1]&&!used[i-1]) continue;
            //调用下一个
            temp.add(nums[i]);
            used[i]=true;
            permuteUnique1(nums,used,temp,result);
            // 回溯部分的代码，和 dfs 之前的代码是对称的
            temp.remove(temp.size()-1);
            used[i]=false;

        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
