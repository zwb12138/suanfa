package queue;

public class Test {
    public static void main(String[] args) {
        CircleArrayQueue circle=new CircleArrayQueue(5);
        circle.add(1);
        circle.add(2);
        circle.add(3);
        circle.add(4);
        circle.out();
        circle.out();
        circle.add(11);
        circle.add(12);
        circle.show();
    }
}
