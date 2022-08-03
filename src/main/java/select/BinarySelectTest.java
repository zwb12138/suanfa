package select;
public class BinarySelectTest {
    public static void main(String[] args) {
        int[] arr={1,3,5,6,7,10,14,16,20,25};
        int target=3;
        int result=BinarySelect(arr,target);
        System.out.println(result);
    }
    public static int BinarySelect(int[] arr,int target){
        int min=0;
        int max=arr.length-1;
        while(min<=max){
            int mid=(min+max)/2;
            if(arr[mid]==target){
                return mid;
            }
            else{
                if(target>arr[mid]){
                    min=mid+1;
                }
                if(target<arr[mid]){
                    max=mid-1;
                }
            }
        }
        return -1;
    }
}
