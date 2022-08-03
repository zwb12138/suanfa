package tree.binaryTree;
public class BinaryTree {
    public   Node root;
    public BinaryTree(Node node) {
        this.root = node;
    }
    //前序遍历                   这里的前序遍历不是node的前序遍历，是为了方便遍历
    public void preSelect(){
        if(this.root==null){
            System.out.println("这是一颗空的二叉树，无法遍历");
        }else{
            this.root.preSelect();
        }
    }
    //中序遍历
    public void infixSelect(){
        if(this.root==null){
            System.out.println("这是一颗空的二叉树，无法遍历");
        }else{
            this.root.infixSelect();
        }
    }
    //后序遍历
    public void lastSelect(){
        if(this.root==null){
            System.out.println("这是一颗空的二叉树，无法遍历");
        }else{
            this.root.lastSelect();
        }
    }
    //先序遍历的方式查找某no的结点
    public Node findByPreSelect(int no){
        if(root==null){
            System.out.println("这是一个空二叉树，无法查找结点");
            return null;
        }else{
            return root.findByPreSelect(no);
        }
    }
    //中序遍历的方式查找某no的结点
    public Node findByInfixSelect(int no){
        if(root==null){
            System.out.println("这是一个空二叉树，无法查找结点");
            return null;
        }else{
            return root.findByInfixSelect(no);
        }
    }
    //后序遍历的方式查找某no的结点
    public Node findByLastSelect(int no){
        if(root==null){
            System.out.println("这是一个空二叉树，无法查找结点");
            return null;
        }else{
            return root.findByLastSelect(no);
        }
    }
    //删除结点
    public void delete(int no){
        if(root==null){
            System.out.println("这是一个空二叉树，无法删除");
            return;
        }else{
            if(root.no==no){
                root.left=null;
                root.right=null;
                root=null;
                return;
            }else{
                root.delete(no);
            }
        }
    }
}

