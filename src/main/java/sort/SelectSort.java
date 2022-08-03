package sort;

import java.util.Arrays;

public class SelectSort {
    public static void main(String[] args) {
        int[] arr={3,1,8,4,2,6,7,10,9,5};
        select(arr);
        System.out.println(Arrays.toString(arr));
    }
    public  static void select(int[] arr){
     for(int i=0;i<arr.length-1;i++){
         for(int j=arr.length-1;j>i;j--){     //原理是第一次从n个中挑出最大的赋值给arr[0]，第2次从n-1个中挑出最大的赋值给arr[1]
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
         }
     }
    }
}
