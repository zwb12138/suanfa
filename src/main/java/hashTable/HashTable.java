package hashTable;
public class HashTable {
    StudentLinkedList[] list;
    int maxSize;
    public HashTable( int maxSize) {
        this.maxSize = maxSize;
        list=new StudentLinkedList[maxSize];
        for(int i=0;i<=maxSize-1;i++){
            list[i]=new StudentLinkedList();  //注意：这里必须逐个创建对象，不然都是空引用，空引用调用方法会发生空指针异常
        }
    }
    //哈希函数
    public int myHashCode(int sid){
            return sid%10;
    }
    //添加学生
    public void add(Student student){
        int hashValue=myHashCode(student.id);
        list[hashValue].add(student);
    }
    //查找某id的学生
    public  void findById(int sid){
        int hashValue=myHashCode(sid);
        Student student=list[hashValue].findById(sid);
        if(student!=null){
            System.out.println("这个学生在"+hashValue+"号链表,id是"+sid);
        }
    }
    //显示哈希表中所有元素
    public void show(){
        for (int i=0;i<=list.length-1;i++){
            list[i].show(i);
        }
    }
}
