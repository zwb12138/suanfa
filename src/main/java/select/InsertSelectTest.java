package select;
public class InsertSelectTest {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int target=5;
        int result=insertSelect(arr,0,arr.length-1,target);
        System.out.println(result);
    }
    public static int insertSelect(int[] arr,int left,int right,int target){
        if(target<arr[left]||target>arr[right]||left>right){  //防止数组越界
            return -1;
        }
        int mid=left+(right-left)*(target-arr[left])/(arr[right]-arr[left]);  //求出索引
        if(arr[mid]==target){
            return mid;
        }else{
            if(arr[mid]>target){
              return   insertSelect(arr,mid+1,right,target);       //如果没有找打target，继续进行插值查找,记得范围对应变化
            }
            if(arr[mid]<target){
               return insertSelect(arr,left,mid+1,target);
            }
        }
        return -1;
    }
}
