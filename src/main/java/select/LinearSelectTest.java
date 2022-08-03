package select;
public class LinearSelectTest {
    public static void main(String[] args) {
        int[] arr={6,2,8,7,3,1,5,9,4,0};
        int target=8;
        int result=linearSelect(arr,target);
        System.out.println(result==-1?"没有找到这个数":"这个数在数组中的下标是"+result);
    }
    public static int linearSelect(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
