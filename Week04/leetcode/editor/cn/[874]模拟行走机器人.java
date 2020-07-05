//机器人在一个无限大小的网格上行走，从点 (0, 0) 处开始出发，面向北方。该机器人可以接收以下三种类型的命令： 
//
// 
// -2：向左转 90 度 
// -1：向右转 90 度 
// 1 <= x <= 9：向前移动 x 个单位长度 
// 
//
// 在网格上有一些格子被视为障碍物。 
//
// 第 i 个障碍物位于网格点 (obstacles[i][0], obstacles[i][1]) 
//
// 机器人无法走到障碍物上，它将会停留在障碍物的前一个网格方块上，但仍然可以继续该路线的其余部分。 
//
// 返回从原点到机器人所有经过的路径点（坐标为整数）的最大欧式距离的平方。 
//
// 
//
// 示例 1： 
//
// 输入: commands = [4,-1,3], obstacles = []
//输出: 25
//解释: 机器人将会到达 (3, 4)
// 
//
// 示例 2： 
//
// 输入: commands = [4,-1,4,-2,4], obstacles = [[2,4]]
//输出: 65
//解释: 机器人在左转走到 (1, 8) 之前将被困在 (1, 4) 处
// 
//
// 
//
// 提示： 
//
// 
// 0 <= commands.length <= 10000 
// 0 <= obstacles.length <= 10000 
// -30000 <= obstacle[i][0] <= 30000 
// -30000 <= obstacle[i][1] <= 30000 
// 答案保证小于 2 ^ 31 
// 
// Related Topics 贪心算法


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        //方向数组，个人感觉像字典
        //每个朝向上的数据变化，比如朝北时取Direction[0]  ->   {0,1}
        //那么x轴的变化为x+0，y轴变化为y+1;
        int[] dx={0,1,0,-1};
        int[] dy={1,0,-1,0};
        //方向下标
        int direction = 0;
        //当前为位置
        int x=0,y=0;
        //最大欧式距离平方
        int aer=0;
        HashSet hashSet = new HashSet();
        //转为坐标
        for(int [] obs:obstacles){
            hashSet.add(obs[0]+","+obs[1]);
        }
        for(int com:commands){
            if(com==-1){//右转
                direction=(direction+1)%4;
            } else if(com==-2){//左转
                direction=(direction+3)%4;
            } else if(com>0){
                while(com-->0){
                    //每走一步，x,y的变化情况
                    int nextX=x+dx[direction];
                    int nextY=y+dy[direction];
                    if(!hashSet.contains(nextX+","+nextY)){
                        x=nextX;
                        y=nextY;
                        //有可能最后转回（0,0）
                        aer = Math.max(aer,x*x+y*y);
                    }else{
                        break;
                    }
                }
            }
        }
        return  aer ;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
