package linkedList;
public class SingleCircleLinkedList {
    private  Girl first=new Girl(-1);
    //构建一个单链环
    public  void add(int num){
        Girl temp=null;
        if(num<1){
            System.out.println("输入的人数数量不合法");
            return;
        }else{
            for(int i=1;i<=num;i++){
                Girl girl=new Girl(i);
                if(i==1){
                    first=girl;
                    first.setNext(girl);
                    temp=first;
                }else{
                    temp.setNext(girl);   //其实temp对于first只用了一次，之后都是为girl服务
                    girl.setNext(first);
                    temp=girl;
                }
            }
        }
    }
    //遍历环中的节点
    public void  show(){
        if(first.getNo()==-1){
            System.out.println("不构成一个环,单个节点没有自己形成一个环");
        }
        Girl temp=first;
        while(true){
            if(temp.getNext()==first){
                System.out.println(temp.getNo());
                break;
            }
            System.out.println(temp.getNo());
            temp=temp.getNext();
        }
    }
    public void count(int startNo,int counts,int num){
        if(first.getNo()==-1||startNo<1||startNo>num){
            System.out.println("输入的参数无效，你他妈还想不想玩游戏了");
            return;
        }
        Girl helper=null;
        helper=first;
        //1 先找到这个环最后的节点
        for(int i=1;i<=num;i++){
            if(helper.getNext()==first){
                break;
            }
            helper=helper.getNext();
        }
        // 2 通过startNo确定这个圆环真正的起点和终点
        for(int i=1;i<=startNo-1;i++){
            first=first.getNext();
            helper=helper.getNext();
        }
        // 3 通过count确定每一轮后的淘汰号数和终点，起点是淘汰号数的下一位，删除节点后记得将终点的末端连接起点
        while(true){
            if(helper==first){
                break;
            }
            for(int i=0;i<counts-1;i++){
                first=first.getNext();
                helper=helper.getNext();
            }
            System.out.println("第"+first.getNo()+"号女孩被淘汰了。。。。。。");
            first=first.getNext();
            helper.setNext(first);
        }
        System.out.println("最后获胜的女孩是"+helper.getNo()+"号");
    }
}
