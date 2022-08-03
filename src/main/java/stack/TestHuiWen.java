package stack;

public class TestHuiWen {
    public static void main(String[] args) {
        String str="abba";
        boolean result=isHuiWen(str);
        System.out.println(str+"判断结果是:"+result);
    }
    public static  boolean isHuiWen(String str){
        ArrayStack arrayStack=new ArrayStack(20);
        int length=str.length();
        if(length==0){
            throw new RuntimeException("字符串为空，无法放入栈中");
        }else {
            for(int i=0;i<length;i++){
                arrayStack.push(str.charAt(i));
            }
        }
        String reverseStr="";
        //注意：下面不能小于栈的元素数量，因为栈的元素数量一直在变化；
        for (int k=0;k<length;k++){
                char c=(char) arrayStack.pop();
                reverseStr+=c;
        }
        if(reverseStr.equals(str)){
            return true;
        }return false;
    }
}
