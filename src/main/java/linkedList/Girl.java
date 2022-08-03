package linkedList;
public class Girl {
    private  int no;
    private Girl next;
    public Girl(int no) {
        this.no = no;
    }

    public int getNo() {
        return no;
    }
    public Girl getNext() {
        return next;
    }
    public void setNext(Girl next) {
        this.next = next;
    }
    @Override
    public String toString() {
        return "Girl{" +
                "no=" + no +
                ", next=" + next +
                '}';
    }
}
