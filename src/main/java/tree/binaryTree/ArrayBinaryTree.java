package tree.binaryTree;
public class ArrayBinaryTree {
    public int[] arr;
    public ArrayBinaryTree(int[] arr) {          //这里的数组就是顺序存储二叉树的数组
        this.arr = arr;
    }
    //先序遍历
    public void preShow(int index){   //从0开始，因为0就是root结点
        System.out.println(arr[index]);
        if(arr.length==0){
            System.out.println("顺序存储二叉树的数组是空的");
            return;
        }else{
            if((index*2+1)<arr.length){
                preShow(index*2+1);
            }
            if((index*2+2)<arr.length){
                preShow(index*2+2);
            }
        }
    }
}
