package stack;

public class ComputerArrayStack {
    private  int top=-1;
    private  int maxSize;
    private int[] array;
    public ComputerArrayStack(int size){
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
    /*实现计算机*/
    //判断是否是符号
    public boolean isOper(int oper){
        if(oper=='-'||oper=='+'||oper=='*'||oper=='/'){
            return true;
        }else{
            return false;
        }
    }
    //判断优先级别
    public int priority(int oper){
        if(oper=='-'||oper=='+'){
            return 1;
        }else if(oper=='*'||oper=='/'){
            return 2;
        }else{
            return -1;
        }
    }
    //获取栈顶元素（其实是为了获取栈顶符号，因为不能弹出，只是想要比较）
    public int peek(){
        return this.array[top];
    }
    //计算
    public int calculate(int temp1,int temp2,int oper){
        int result=0;
        switch (oper){
            case '-':
                result=temp2-temp1;
                break;
            case '+':
                result=temp2+temp1;
                break;
            case '*':
                result=temp1*temp2;
                break;
            case '/':
                result=temp2/temp1;
                break;
        }
        return  result;
    }










}
