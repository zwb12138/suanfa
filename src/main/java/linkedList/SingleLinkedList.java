package linkedList;
public class SingleLinkedList {
    public GoodsNode head = new GoodsNode(0, "", 0);

    //在尾部插入id不重复的节点
    public void addLast(GoodsNode node) {
        GoodsNode temp = head;
        while (true) {
            if (temp.next == null) {
                break;
            } else {
                if (temp.next.id == node.id) {
                    throw new RuntimeException("id不能重复");
                }
                temp = temp.next;
            }
        }
        temp.next = node;
    }

    //根据id顺序插入id不重复的节点      (即使在尾部，也是按照两个节点中间插入自己的节点的思路来)
    /*秘诀：永远记住temp，并且用head和数字来表示temp*/
    public void addByIdOrder(GoodsNode node) {
        GoodsNode temp = head;
        boolean flag = false;
        while (true) {
            if (temp.next == null) {
                break;
            } else {
                if (temp.next.id == node.id) {
                    flag = true;
                    break;
                }
                if (temp.next.id > node.id) {
                    break;
                }
                temp = temp.next;
            }
        }
        if (flag) {
            System.out.println("不能插入重复的id");
        } else {
            //注意：不要颠倒
            node.next = temp.next;
            temp.next = node;
        }

    }

    //插入到自定义id的节点后面
    public void addById(int id, GoodsNode node) {
        GoodsNode temp = head.next;
        boolean flag = false;
        while (true) {
            if (temp.id == node.id) {
                flag = true;
                break;
            } else {
                if (temp.id == id) {
                    break;
                }
                temp = temp.next;
            }
        }
        if (flag) {
            System.out.println("不能插入id重复的节点");
        } else {
            node.next = temp.next;
            temp.next = node;
        }
    }

    //遍历链表中的节点
    public void show() {
        GoodsNode temp = head.next;
        while (true) {
            if (head.next == null) {
                System.out.println("空链表");
                break;
            } else {
                if (temp == null) {
                    break;
                }
                System.out.println(temp);
                temp = temp.next;
            }
        }
    }

    //修改节点
    public void update(GoodsNode node) {
        if(head.next==null){
            System.out.println("这是一个空链表");
            return;
        }
        GoodsNode temp=head.next;
        while (true){
           if(temp==null){
               System.out.println("没有找到这个节点");
               return;
           }else{
               if(temp.id==node.id){
                   break;
               }
               temp=temp.next;
           }
        }
        temp.name=node.name;
        temp.price=node.price;
    }

    //删除节点      改查都是从第一个节点开始，只有添加和删除是头节点开始
    public void delete(int id) {
        GoodsNode temp = head;
        boolean flag = true;
        while (true) {
            if (head.next == null) {
                System.out.println("这是一个空链表");
            } else {
                if (temp.next.id == id) {
                    flag = false;
                    break;
                }
                temp = temp.next;  //通过temp.next自然而然退出temp
            }

        }
        if (flag) {
            System.out.println("没有找到删除的节点");
        } else {
            temp.next = temp.next.next;
        }
    }

    //统计节点个数
    public int count() {
        GoodsNode temp = head;
        int count = 0;
        while (true) {
            if (head.next == null) {
                System.out.println("这是一个空链表");
                return count;
            } else {
                if (temp.next == null) {
                    break;
                }
                ++count;
                temp = temp.next;
            }
        }
        return count;
    }
//反转链表
    public void reverse(GoodsNode head) {  //head
        if (head.next == null || head.next.next == null) {
            return;
        }
        GoodsNode point = head.next;  //1
        GoodsNode next = null;
        GoodsNode reverseNode = new GoodsNode(0, "", 0);  //反转链表的头结点

        while (point != null) {
            next = point.next;
            point.next = reverseNode.next;
            reverseNode.next = point;
            point = next;
        }
        head.next = reverseNode.next;
    }
}