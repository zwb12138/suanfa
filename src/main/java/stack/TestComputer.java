package stack;

public class TestComputer {
    public static void main(String[] args) {
        String str = "4+3+2*3-1";
            ComputerArrayStack numStack=new ComputerArrayStack(10);
            ComputerArrayStack symbolStack=new ComputerArrayStack(10);
            int length=str.length();
            int temp1;
            int temp2;
            int symbol;
            int result;
            //parseInt的参数是string
            String values="";
            for(int i=0;i<length;i++){
                char c=str.charAt(i);
                //如果不是符号
                if(!symbolStack.isOper(c)){
                    if(i==length-1){
                        values=values+c;
                        numStack.push(Integer.parseInt(values));
                    }else{
                        char next=str.substring(i+1,i+2).charAt(0);
                        if(symbolStack.isOper(next)){
                            values=values+c;
                            numStack.push(Integer.parseInt(values));
                            values="";
                        }
                    }

                }else{
                    if(symbolStack.isEmpty()){
                        symbolStack.push(c);
                    }else{
                        if(symbolStack.priority(symbolStack.peek())>symbolStack.priority(c)){
                            temp1=numStack.pop();
                            temp2=numStack.pop();
                            symbol=symbolStack.pop();
                            result=numStack.calculate(temp1,temp2,symbol);
                            numStack.push(result);
                            symbolStack.push(c);
                        }else{
                            symbolStack.push(c);
                        }
                    }
                }
            }
            while(true){
                if(symbolStack.isEmpty()){
                    break;
                }else{
                    temp1=numStack.pop();
                    temp2=numStack.pop();
                    symbol=symbolStack.pop();
                    result=numStack.calculate(temp1,temp2,symbol);
                    numStack.push(result);
                }
            }
            result=numStack.pop();
        System.out.println("四则运算的结果是"+result);
    }
}
