package Algorithm.Sort;

public class QuickSort {

    void sort(int [] arr,int begin,int end){
        if(begin>=end)
            return;

//        左右指针
        int left=begin;
        int right=end;
//        基准值
        int key=begin;

        while(left<right){

//            从右指针找到一个小于基准值的位置
            while(left<right&&arr[right]>=arr[key]){
                right--;
            }

//            从左指针找到一个大于基准值的位置
            while(left<right&&arr[left]<=arr[key]){
                left++;
            }

//            小的换到右边，大的换到左边
            int tmp=arr[left];
            arr[left]=arr[right];
            arr[right]=tmp;
        }

//        交换基准值和当前left=right的值
        int tmp=arr[key];
        arr[key]=arr[right];
        arr[right]=tmp;

//        重新对基准值赋值
        key=left;

        sort(arr,begin,key-1);
        sort(arr,key+1,end);
    }

    public static void main(String[] args) {
        QuickSort quickSort=new QuickSort();
        int []arr={2,1,4,3,9,7,4,8};
//        bubbleSort.sort(arr);
        quickSort.sort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }


}
