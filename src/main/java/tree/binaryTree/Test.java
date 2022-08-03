package tree.binaryTree;
public class Test {
    public static void main(String[] args) {
        Node n1=new Node(1,"张文彬");
        Node n2=new Node(2,"纪小冰");
        Node n3=new Node(3,"黄倩萍");
        Node n4=new Node(4,"谢琪媛");
        Node n5=new Node(5,"刘秀敏");
        Node n6=new Node(6,"沈桐");
        n1.setLeft(n2); //目前这样创建二叉树，后面再用递归创建二叉树
        n1.setRight(n3);
        n2.setLeft(n4);
        n2.setRight(n5);
        n3.setLeft(n6);

        BinaryTree binaryTree=new BinaryTree(n1);
        /*binaryTree.preSelect();
        System.out.println("----------------");
        binaryTree.infixSelect();
        System.out.println("----------------");
        binaryTree.lastSelect();*/
       /* Node result=binaryTree.findByLastSelect(3);
        System.out.println(result);*/
       binaryTree.delete(5);
       binaryTree.preSelect();
    }
}
