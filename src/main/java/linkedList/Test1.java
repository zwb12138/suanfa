package linkedList;

public class Test1 {
    public static void main(String[] args) {
        SingleLinkedList single=new SingleLinkedList();
        single.addLast(new GoodsNode(3,"鞋子",100));
        single.addLast(new GoodsNode(1,"帽子",200));
        single.addLast(new GoodsNode(2,"柜子",300));
        single.update(new GoodsNode(2,"女人",20000));
        single.show();
        //single.delete(3);

        /*single.addByIdOrder(new GoodsNode(3,"鞋子",100));
        single.addByIdOrder(new GoodsNode(1,"帽子",200));
        single.addByIdOrder(new GoodsNode(2,"柜子",300));
        single.addById(1,new GoodsNode(100,"飞机",100000));
        single.show();
        System.out.println("单链表的节点个数是"+single.count());*/
    }
}
