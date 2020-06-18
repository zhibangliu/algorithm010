_学习笔记_
# 数据结构
## 这是一段普通的文本，  
    <br>要使用<br> 
 `Thank`you  
 
 大标题
 ====
 中标题
 --
 # 一级标题
 ## 二级标题
 ### 三级标题
 #### 四级标题
    正文，**这是**一*普通*文本`sadas`  
    ~~~~sad~~~~sa 
>数据结构
>>树  
>>>二叉树  
>>>>平衡二叉树  
>>>>>满二叉树
* 重点以
* 重点2
    * 重点2.2
      * zhongdian12 
       
[我的链接]()  
![mahua](http://www.baidu.com/img/bdlogo.gif)

 ```java_holder_method_tree
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
 ```
