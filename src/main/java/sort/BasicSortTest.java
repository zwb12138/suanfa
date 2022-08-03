package sort;
public class BasicSortTest {
    public static void main(String[] args) {
        int[] arrays = new int[]{53,542,3,63,14,214,154,748,616};
        sort(arrays);
    }
    public  static void sort(int[] arr){
        //1 找出所有数的最大位数
        int max=0;
        for (int i=0;i<arr.length;i++)
        {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        String str=max+"";
        int maxWei=str.length();     //这里是暴力枚举,所以没有用到maxWei，可以使用递归
        //2 根据个位数，将所有数装到对应的桶中，并且在temp桶中对应的桶声明该桶元素个数
        int[][] bucket=new int[10][arr.length];    //都是10，是因为只有0-9
        int[] temp=new int[10];
        int location=0;
        for(int i=0;i<arr.length;i++){
            location=arr[i]/1%10;
            bucket[location][temp[location]]=arr[i];
            ++temp[location];
        }
        //3 将所有数按照temp顺序取出来,即有数据的桶才去取
        int index=0;
        for(int i=0;i<temp.length;i++){
            if(temp[i]!=0){
                for(int j=0;j<temp[i];j++){
                    arr[index]=bucket[i][j];
                    ++index;
                }
                temp[i]=0;
            }
        }
        //4 十位数和百位数的处理，是仿照个位数的
        for(int i=0;i<arr.length;i++){
            location=arr[i]/10%10;
            bucket[location][temp[location]]=arr[i];
            ++temp[location];
        }
       index=0;
        for(int i=0;i<temp.length;i++){
            if(temp[i]!=0){
                for(int j=0;j<temp[i];j++){
                    arr[index]=bucket[i][j];
                    ++index;
                }
                temp[i]=0;
            }
        }
        for(int i=0;i<arr.length;i++){
            location=arr[i]/100%10;
            bucket[location][temp[location]]=arr[i];
            ++temp[location];
        }
        index=0;
        for(int i=0;i<temp.length;i++){
            if(temp[i]!=0){
                for(int j=0;j<temp[i];j++){
                    arr[index]=bucket[i][j];
                    ++index;
                }
                temp[i]=0;
            }
        }
        System.out.println("经过基数排序后的序列是:");
        for (int i:arr
             ) {
            System.out.print(i+" ");
        }
    }
}
