package linkedList;

public class DoubleLinkedList  {
    public BooksNode head=new BooksNode(0,"",0);
    //链表最后添加新的节点(id不重复)
    public void addLast(BooksNode node){
        BooksNode temp=head;
        boolean flag=false;
        while(true){
            if(head.next==null){
                break;
            }else{
                if(temp.next==null){
                    break;
                }
                if(temp.next.id==node.id){
                    flag=true;
                    break;
                }
                temp=temp.next;
            }
        }
        if(flag){
            System.out.println("不能添加id重复的节点");
        }else{
            temp.next=node;
            node.pre=temp;
        }
    }
    //遍历节点
    public void show(){
        BooksNode temp=head.next;
        while(true){
            if(head.next==null){
                System.out.println("这是一个空链表");
                break;
            }else{
                if(temp==null){
                    break;
                }
                System.out.println(temp);
                temp=temp.next;
            }
        }
    }
    //更新节点
    public void update(BooksNode node){
       if(head.next==null){
           System.out.println("这是一个空链表");
           return;
       }
       BooksNode temp=head.next;
       while (true){
           if(temp==null){
               System.out.println("没有找到要修改的节点");
               return;
           }
           if(temp.id==node.id){
               break;
           }
           temp=temp.next;
       }
       temp.name=node.name;
       temp.price=node.price;
    }
    //删除节点
    public void delete(int id){
        if(head.next==null){
            System.out.println("这是一个空链表,无法继续删除");
        }
        BooksNode temp=head;
        while(true){
            if(temp.next==null){
                System.out.println("没有找到要删除的节点");
                return;
            }
            if(temp.next.id==id){  //删除2，那么temp是1
                break;
            }
            temp=temp.next;
        }
        //因为有pre，所以要考虑到最后一个节点的情况：即如果删除的是最后一个节点，那么他没有pre
        temp.next=temp.next.next;
        if(temp.next!=null){
            temp.next.pre=temp;
        }
    }


}
