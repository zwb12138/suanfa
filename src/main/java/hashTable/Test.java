package hashTable;
public class Test {
    public static void main(String[] args) {
        /*StudentLinkedList list=new StudentLinkedList();
        Student s1=new Student(1,"zs");
        Student s2=new Student(2,"ls");
        list.add(s1);
        list.add(s2);
        Student result=list.findById(1);
        //System.out.println(result);
        list.show(2);*/
        HashTable hashTable=new HashTable(10);
        Student s1=new Student(1,"zwb");
        Student s2=new Student(11,"jxb");
        Student s3=new Student(21,"hqp");
        Student s4=new Student(2,"张文彬");
        Student s5=new Student(12,"纪小冰");
        Student s6=new Student(22,"黄倩萍");
        hashTable.add(s1);
        hashTable.add(s2);
        hashTable.add(s3);
        hashTable.add(s4);
        hashTable.add(s5);
        hashTable.add(s6);
        //hashTable.add(s6); //注意：哈希表中的可以添加id相同的，但是不能重复添加同一个student
        hashTable.show();
        hashTable.findById(11);
    }
}
