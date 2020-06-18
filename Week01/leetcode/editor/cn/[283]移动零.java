//给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。 
//
// 示例: 
//
// 输入: [0,1,0,3,12]
//输出: [1,3,12,0,0] 
//
// 说明: 
//
// 
// 必须在原数组上操作，不能拷贝额外的数组。 
// 尽量减少操作次数。 
// 
// Related Topics 数组 双指针


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public void moveZeroes(int[] nums) {
        //看题解：快慢指针？
        int j=0;
        for(int i=0 ;i<nums.length;i++){
            if(nums[i]!=0){
                //这样j一直在i左边，j一直指向左边最后一个非零的位置的下一个位置（等待赋值）
                nums[j++]=nums[i];
            }
        }
        //现在j后边的数全部置0
        while (j<nums.length){
            nums[j++]=0;
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
