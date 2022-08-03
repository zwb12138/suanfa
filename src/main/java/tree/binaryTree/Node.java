package tree.binaryTree;
public class Node {
    public int no;
    public String name;
    public Node left;
    public Node right;
    public Node() {
    }
    public Node(int no, String name) {
        this.no = no;
        this.name = name;
    }
    //前序遍历
    public void preSelect(){
        System.out.println(this);
        if(this.left!=null){
            this.left.preSelect();
        }
        if(this.right!=null){
            this.right.preSelect();
        }
    }
    //中序遍历
    public void infixSelect(){
        if(this.left!=null){
            this.left.infixSelect();
        }
        System.out.println(this);
        if(this.right!=null){
            this.right.infixSelect();
        }
    }
    //后序遍历
    public void lastSelect(){
        if(this.left!=null){
            this.left.lastSelect();
        }
        if(this.right!=null){
            this.right.lastSelect();
        }
        System.out.println(this);
    }
    //前序遍历的方式查找某no的结点
    public Node findByPreSelect(int no){
        if(this.no==no){
            return this;
        }
        Node node=null;          //(递归不要太纠结debug中的方法执行顺序，只需要关心大概逻辑,即先执行第一遍递归)
        if(this.left!=null){        //即实现这个递归的思路是：让总体按照中左右的顺序进行，可以用第一次左的递归的结果作为判断，
            node=this.left.findByPreSelect(no);      //如果为空说明没找到，可以跳到右的递归
        }
        if(node!=null){
            return node;
        }
        if(this.right!=null){
            node=this.right.findByPreSelect(no);
        }
        if(node!=null){
            return node;
        }
        return node;
    }
    //中序遍历的方式查找某no的结点
    public Node findByInfixSelect(int no){
        Node node=null;
        if(this.left!=null){
            node=this.left.findByInfixSelect(no);
        }
        if(node!=null){
            return node;
        }
        if(this.no==no){
            return this;
        }
        if(this.right!=null){
            node=this.right.findByInfixSelect(no);
        }
        if(node!=null){
            return node;
        }
        return node;
    }
    //后序遍历的方式查找某no的结点
    public Node findByLastSelect(int no){
        Node node=null;
        if(this.left!=null){
            node=this.left.findByLastSelect(no);
        }
        if(node!=null){
            return node;
        }
        if(this.right!=null){
            node=this.right.findByLastSelect(no);
        }
        if(node!=null){
            return node;
        }
        if(this.no==no){
            return this;
        }
        return node;
    }
    //删除结点
    public void delete(int no){               //这个删除方法的思路是：先执行删除操作的‘第一遍递归’,即左右，左右
        if(this.left!=null&&this.left.no==no){  //&&前面是为了防止空指针异常
            this.left=null;
            return;
        }
        if(this.right!=null&&this.right.no==no){
            this.right=null;
            return;
        }
        if(this.left!=null){
            this.left.delete(no);
        }
        if(this.right!=null){
            this.right.delete(no);
        }
    }
    @Override
    public String toString() {
        return "Node{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
    public void setLeft(Node left) {
        this.left = left;
    }
    public void setRight(Node right) {
        this.right = right;
    }
}
