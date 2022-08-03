package tree.binaryTree;
public class Test1 {
    public static void main(String[] args) {
        int[] arr={34,12,3,5,1,9,76,4};
        ArrayBinaryTree arrayBinaryTree=new ArrayBinaryTree(arr);
        arrayBinaryTree.preShow(0);
    }
}
