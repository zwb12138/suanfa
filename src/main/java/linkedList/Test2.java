package linkedList;

public class Test2 {
    public static void main(String[] args) {
        //打断点就是打在你要开始查看的数据的位置
        DoubleLinkedList myDouble=new DoubleLinkedList();
        myDouble.addLast(new BooksNode(1,"三国演义",100));
        myDouble.addLast(new BooksNode(2,"红楼梦",50));
        myDouble.addLast(new BooksNode(3,"水浒传",200));
        //myDouble.update(new BooksNode(1,"金瓶梅",200000));
        myDouble.delete(2);
        myDouble.show();
    }
}
