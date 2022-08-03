package sort;

import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {
        int[] arr={3,1,5,9,2,4,8,7,10};
        insert(arr);
        System.out.println(Arrays.toString(arr));
    }
    public  static void insert(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i;j>=0;j--){  //要求：从小排到打。原理：每次插入一个数时，都与左边所有的数比较。如果比最靠近自己的数大，那么break，剩下的数都不用
                if(arr[j]>arr[j+1]){//继续比较了；但是如果比最靠近自己的数小，那么就要继续往下比较并且交换位置；
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }else{
                    break;
                }
            }
        }
    }
}
