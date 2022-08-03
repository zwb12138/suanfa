package sort;
import java.util.Arrays;
public class ShellSort {
    public static void main(String[] args) {
        int[] array = new int[]{1,5,9,7,2,6,0,3,8,4};
        shell(array);
        System.out.println(Arrays.toString(array));
    }
    public static  void shell(int[] arr){
        for(int gap=arr.length/2;gap>=1;gap/=2){   //实现增量变化
            for(int i=0;i<arr.length-gap;i++){ //这里是为了下面的arr[j+gap]不越界；另外只需要列举到倒数第二个数据(和arr[9]相差一个增量)就可以了；
                for(int j=i;j>=0;j-=gap){
                    if(arr[j]>arr[j+gap]){   //尝试插入的是arr[j+gap]
                        int temp=arr[j];
                        arr[j]=arr[j+gap];
                        arr[j+gap]=temp;
                    }else{
                        break;
                    }
                }
            }
        }
    }
}
