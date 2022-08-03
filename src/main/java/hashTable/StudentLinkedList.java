package hashTable;
public class StudentLinkedList {
    Student head=null;
    //在末尾添加可以重复的节点
    public void add(Student student){
        if(head==null){
            head=student;
            return;
        }
        Student temp=head;
        while (true){
            if(temp.next==null){
                break;
            }
            temp=temp.next;
        }
        temp.next=student;
    }
    //根据id查找对应的节点
    public Student findById(int id){
        boolean flag=false;
        if(head==null){
            System.out.println("这是空链表");
            return null;
        }
        Student temp=head;
        while(true){
            if(temp==null){
                flag=true;
                break;
            }
            if(temp.id==id){
                break;
            }
            temp=temp.next;
        }
        if(flag){
            System.out.println("没有找到这个节点");
            return null;
        }else{
            return temp;
        }
    }
    //展示链表的所有节点
    public void show(int no){   //no是这条链表在哈希表中的排序，方便哈希表调用时说明是第几条链表的元素
        if(head==null){
            System.out.println("第"+no+"号链表是空链表");
            return;
        }
        Student temp=head;
        while(true){
            if(temp==null){
               break;
            }
            else{
                System.out.print("我是第"+no+"号链表的节点："+temp+",");
            }
            temp=temp.next;
        }
        System.out.println();
    }
}

