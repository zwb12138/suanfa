package sort;
import java.util.Arrays;
public class MergeSortTest {
    public static void main(String[] args) {
        int[] arr={6,2,8,7,3,1,5,9,4,0};
        // 1 创建一个容量一致的临时数组
        int[] temp=new int[arr.length];
        MergeSort(arr,0,arr.length-1,temp);
        System.out.println(Arrays.toString(arr));
    }
    //2 无限分左边的左边，直到left>=right，最小的左边无法再分，执行他的右边，右边也无法再分，才能执行治理（分是从大分到小.治理是先治理小的,小的都治理好了,最后治理大的）
    public static  void MergeSort(int [] arr,int left,int right,int[] temp){
        int mid=(left+right)/2;
        if(left<right){
            MergeSort(arr,left,mid,temp);
            MergeSort(arr,mid+1,right,temp);
            zhi(arr,left,right,temp);
        }
    }
    public  static  void zhi(int[] arr,int left,int right,int[] temp){
        int mid=(left+right)/2;
        int i=left;               //i是左边组的第一个元素，j是右边组的第一个元素
        int j=mid+1;
        int t=0;
        while(i<=mid&&j<=right){   //两组数据比较
            if(arr[i]<=arr[j]){
                temp[t]=arr[i];
                t++;
                i++;
            }else{
                temp[t]=arr[j];
                t++;
                j++;
            }
        }
        while(i<=mid){         //这两个循环最多进入一个
            temp[t]=arr[i];
            t++;
            i++;
        }
        while(j<=right){
            temp[t]=arr[j];
            t++;
            j++;
        }
        //将temp数组的值赋值给对应的组（数组的小弟
        int index=left;              //注意这里index不止是0，多种情况,arr不会覆盖，因为left不同
        int k=0;
        while(index<=right){
            arr[index]=temp[k];
            k++;
            index++;
        }
    }
}
