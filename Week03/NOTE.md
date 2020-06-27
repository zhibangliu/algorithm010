#学习笔记 
##泛型递归
```java
public void recur(int level, int param) { 
    //终止条件
    if(level>MAX_LEVEL){
        // process result 
        return; 
    }
    //当前层的逻辑
    process(level,param)
    //下探到下一层
    recur(level: level + 1, newParam);
    //恢复当前状态
}
```    
##分治

* 169.多数元素  
    >*给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
你可以假设数组是非空的，并且给定的数组总是存在多数元素。*
```java
 public int majorityElement(int[] nums) {
        //方法一:分治
       return majorityElement(nums,0,nums.length-1);
    }
     private int majorityElement(int[] nums,int lo,int hi){
        //终止条件
         if(lo==hi){
             return nums[lo];
         }
         //准备数据
         int mid =(hi-lo)/2
         //解决子问题
         int left =  majorityElement(nums,int lo,int mid);
         int right = majorityElement(nums,int mid+1,int hi);
         if(left==right){
             return left;
         }
         //处理并生成结果
         // otherwise, count each element and return the "winner".
         int leftCount = countInRange(nums, left, lo, hi);
         int rightCount = countInRange(nums, right, lo, hi);
         return leftCount>rightCount?left:right;
     }

    private int countInRange(int[] nums, int num, int lo, int hi) {
        int count = 0;
        for (int i = lo; i <= hi; i++) {
            if (nums[i] == num) {
                count++;
            }
        }
        return count;
    }
```
##回溯