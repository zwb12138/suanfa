package sort;
import java.util.Arrays;
public class QuickSort {
    public static void main(String[] args) {
        int[] arrays = new int[]{2,9,4,7,3,3,6,5};
        quick(arrays,0,arrays.length-1);
        System.out.println(Arrays.toString(arrays));
    }
    public  static void quick(int[] arr,int left,int right){
        int l=left;
        int r=right;
        int pivot=arr[(l+r)/2];
 //1 完成一次一分为二（如果发现转换位置后l对应的值等于pivot，那么需要r--,因为如果不使r迁移，那么下次执行while方法，r永远卡在那个位置）
        while(l<r){
            while(arr[l]<pivot){
                l++;
            }
            while (arr[r]>pivot){
                r--;
            }
            if(l>=r){
                break;
            }
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            if(arr[r]==pivot){
                l++;
            }
            if(arr[l]==pivot){
                r--;
            }
        }
//2 如果l==r不做如下操作，那么上面的while()永远不满足，会直接无限进入递归导致栈的溢出（注意不是数组的越界）
        if(l==r){
            l++;
            r--;
        }
        if(left<r){
            quick(arr,left,r);
        }
        if(right>l){
            quick(arr,l,right);
        }
    }
}
