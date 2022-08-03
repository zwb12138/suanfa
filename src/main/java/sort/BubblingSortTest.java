package sort;

public class BubblingSortTest {
    public static void main(String[] args) {
        int[] arr={4,5,6,3,2,1};
        sort(arr);
        for (int i:arr
             ) {
            System.out.print(i+" ");
        }
    }
    public static void sort(int[] arr){
        //1 6个数需要对比5轮
        for(int i=0;i<arr.length;i++){
            //2 每轮需要两两对比的次数
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=0;
                    temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
}
