package select;
import java.util.Arrays;
public class FibonacciSelectTest {
    public static void main(String[] args) {
        int[] arr={2,4,5,7,10,14,18,21,33};
        int target=33;
        int result=fibonacci(arr,target);
        System.out.println(result);
    }
    //1 构建一个fibonacci数列的数组
    public static int[] f(){
        int[] f=new int[20];
        f[0]=0;
        f[1]=1;
        for(int i=2;i<=f.length-1;i++){
            f[i]=f[i-1]+f[i-2];
        }
        return f;
    }
    public  static  int fibonacci(int[] arr,int target){
            int left=0;
            int right=arr.length-1;
            int k=0;
            int[] f=f();
            //2 创建将array改造成满足斐波那契规则长度的数组
            while(right>f[k]-1){                          //数组的长度必须等于或者小于某个  f[k]-1  ,这样才能通过斐波那契的规律找到mid
                k++;
            }
            int[] temp=Arrays.copyOf(arr,f[k]);        //后者是长度,复制array的f【k】个元素作为temp，不够用0加上(注意：这里是数量，不是上面的下标，所以是f(k))
            for(int i=right+1;i<temp.length;i++){
                temp[i]=arr[right];
            }
        //3 寻找切点，不断以切点一分为2，直到temp[mid]==key
        while(left<=right){
                int mid=left+f[k-1]-1;
                if(temp[mid]==target){
                    if(mid<=right){                //因为之前可能有添加几个arr[hight]作为补充，所以判断是否越界，说明是下标是hight，因为最后几个数都是arr[hight]
                        return mid;
                    }else if(mid>right){
                        return right;
                    }
                }else if(target>temp[mid]){
                    left=mid+1;
                    k-=2;
                }else if(target<temp[mid]){
                    right=mid-1;
                    k--;
                }
        }
        return -1;
    }
}
