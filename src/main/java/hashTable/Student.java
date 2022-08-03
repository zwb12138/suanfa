package hashTable;
public class Student {
    public int id;
    public String name;
    public  Student next;
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public Student() {
    }
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
