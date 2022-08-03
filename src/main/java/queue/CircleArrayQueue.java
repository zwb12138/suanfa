package queue;

public class CircleArrayQueue {
    int front=0;  //指向队头
    int rear=0;  //指向队尾的下一个
    int maxSize;  //实际队列容量是maxsize-1
    int[] arr;
    //构造方法
    public CircleArrayQueue(int maxSize) {
        this.maxSize = maxSize;
        this.arr = new int[maxSize];
    }
    //判断非满
    public boolean isFull(){
       return (rear+1)%maxSize==front;
    }
    //判断非空
    public boolean isEmpty(){
       return rear==front;
    }
    //插入队列
    public void add(int no){
        if(isFull()){
            System.out.println("无法继续插入");
            return;
        }
        arr[rear]=no;
        rear=(rear+1)%maxSize;
    }
    //移出队列
    public int out(){
        if(isEmpty()){
            System.out.println("队列空了，无法继续取出");
        }
       int result=arr[front];
        arr[front]=0;        //这里将数组对应下标的元素清空，debug中显示会更直观
        front=(front+1)%maxSize;
        return result;
    }
    //遍历队列的元素
    public void show(){
        for(int i=front;i<front+length();i++){
            System.out.println("arr["+(i%maxSize)+"]="+arr[i%maxSize]);
        }
    }

    //得到队头元素
    public int getHead(){
        return arr[front];
    }
    //统计队列长度
        public int length(){
            return (rear-front+maxSize)%maxSize;
        }
}
