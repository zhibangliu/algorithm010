学习笔记
# 数据结构
* 数组（Array）  增删O(n)
* 链表（LinkedList）
    * 单向链表 查询O(n)
    * 双向链表 查询O(n)
    * 跳表：查询O(logn)
* Stack：先入后出；添加、删除皆为 O(1)
  
* Queue：先入先出；添加、删除皆为 O(1)
* Deque: Double-End Queue 端可以进出的 Queue 
* Priority Queue: 优先队列  

      1.插入操作：O(1)
      2.取出操作：O(logN) - 按照元素的优先级

  
    
    
    sda  

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
