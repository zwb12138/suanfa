package sparseArray;

public class SparseArrayTest  {
    public static void main(String[] args) {
        // 创造出一个棋盘(非主要)
        int[][] chess=new int[11][11];
        chess[1][2]=1;
        chess[2][3]=2;
        //查看棋盘(非主要)
        for (int[] arr:chess
             ) {
            for (int i:arr
                 ) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
        //棋盘转换成稀疏数组
        //1 求出有效元素的总个数
        int count=0;
        for (int[] arr:chess
        ) {
            for (int i:arr
            ) {
               if(i!=0){
                   count++;
               }
            }
        }
        //2 创建稀疏数组的第一行
        int[][] sparseArray=new int[count+1][3];
        sparseArray[0][0]=11;
        sparseArray[0][1]=11;
        sparseArray[0][2]=count;
        //3 创建除了第一行的其他行
        int line=1;
        for(int i=0;i<11;i++){
            for(int j=0;j<11;j++){
                if(chess[i][j]!=0){
                    sparseArray[line][0]=i;
                    sparseArray[line][1]=j;
                    sparseArray[line][2]=chess[i][j];
                    ++line;
                }
            }
        }
        // 查看转换的稀疏数组(非主要)
        for (int[] arr:sparseArray
             ) {
            for (int i:arr
                 ) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
        // 将稀疏数组转换成原来的数组
       int[][] array=new int[sparseArray[0][0]][sparseArray[0][1]];
        for(int i=1;i<=sparseArray[0][2];i++){
                array[sparseArray[i][0]][sparseArray[i][1]]=sparseArray[i][2];
        }
        // 查看转换后的数组
        for (int[] arr:array
             ) {
            for (int i:arr
                 ) {
                System.out.print(i+",");
            }
            System.out.println();
        }
    }


}
