package zwb.shu.tree;
public class ArrayBinaryTree {
    private int[] arrays;
    public ArrayBinaryTree(int[] arrays){
        this.arrays = arrays;
    }
     //前序遍历顺序存储二叉树
        public void preSelect(int index){
        if (this.arrays == null || arrays.length==0){
            System.out.println("存储数组为空...");
            return;
        }
            System.out.println(arrays[index]);
        //向左递归
        if ((index*2+1)<arrays.length){
            preSelect(index*2+1);
        }
      //向右递归
        if ((index*2+2)<arrays.length){
            preSelect(index*2+2);
        }
    }
}
