package recursion;

public class MazeText {
    public static void main(String[] args) {
        //创建一个迷宫 (非主要)
        int[][] maze=new int[8][7];
        maze[3][1]=1;
        maze[3][2]=1;
        for (int i=0;i<=6;i++){
            maze[0][i]=1;
            maze[7][i]=1;
        }
        for (int j=1;j<=7;j++){
            maze[j][0]=1;
            maze[j][6]=1;
        }
        //查看迷宫(非主要)
        for (int[] arr:maze
             ) {
            for (int i:arr
                 ) {
                System.out.print(i+"  ");
            }
            System.out.println();
        }
        //测试迷宫   (非主要)
        Order order=new Order();
        order.setNo(100);
        isRun(1,1,order,maze);
        System.out.println();
        //展示迷宫路线(非主要)
        for (int[] arr:maze
        ) {
            for (int i:arr
            ) {
                System.out.print(i+"       ");
            }
            System.out.println();
        }
    }
    //创建根据下右上左策略求出迷宫路径的方法
    public static Boolean isRun(int i,int j,Order order,int[][] maze){
        if(i==5&&j==2){
            maze[i][j]=order.getNo();
            return true;
        }
        if(maze[i][j]==0) {
            maze[i][j] = order.getNo();
            order.setNo(order.getNo() + 1);
              if (isRun(i + 1, j, order, maze)) {
                return true;
            } else if (isRun(i, j + 1, order, maze)) {
                return true;
            } else if (isRun(i - 1, j, order, maze)) {
                return true;
            } else if (isRun(i, j - 1, order, maze)) {
                return true;
            } else {
                maze[i][j] = 3;
                return false;
            }
        }
            return false;
    }
}
