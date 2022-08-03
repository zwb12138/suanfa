package stack;

public class ArrayStack {
     private  int top=-1;
     private  int maxSize;
     private int[] array;
     public ArrayStack(int size){
         this.maxSize=size;
         array=new int[size];
     }
    //判断是否空栈
    public  boolean isEmpty(){
         return this.top==-1;
    }
    //判断是否满栈
    public  boolean isFull(){
        return this.top==this.maxSize-1;
    }
    //压栈
    public void push(int x){
         //这只是自定义提示而已，就算没有这句代码，栈满系统也会提示
         if(isFull()){
             throw new RuntimeException("栈满了，不能继续压栈！！");
         }
         top++;
         array[top]=x;
    }
    //弹栈
    public  int pop(){
         if(isEmpty()){
             throw new RuntimeException("栈空了，不能继续弹栈！！");
         }
         int result=array[top];
         top--;
         return  result;
    }
    //遍历栈中元素
    public void traverse(){
        for (int i:this.array
             ) {
            System.out.println("第"+(i+1)+"个元素是:"+array[i]);
        }
    }
    //返回栈中元素个数
    public int number(){
         return this.top+1;   //注意，不能是length，length是array的容量
    }
}
