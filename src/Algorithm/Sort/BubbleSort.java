package Algorithm.Sort;


/**
 * 冒泡排序算法
 */
public class BubbleSort {

    public void sort(int[] arr){
        for(int i=0;i<arr.length;i++){  //控制冒泡的次数
            for(int j=0;j< arr.length-1;j++){ //控制冒泡一层层到最后
                if(arr[j]>arr[j+1]){
//                    如果前一个比后一个数大，交换
                    int tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                }
            }
        }
    }

    public void sort_bigger(int[] arr){
        for(int i=0;i<arr.length;i++){  //控制冒泡的次数
            //后面的部分其实都已经排好序了，所以不需要遍历到length-1
            boolean flag=true;
            for(int j=0;j< arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
//                    如果前一个比后一个数大，交换
                    int tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                    flag=false;
                }
            }
//            如果flag没有变化的话，说明排序已经完成
            if(flag){
                break;
            }
        }
    }

    public static void main(String[] args) {
        BubbleSort bubbleSort=new BubbleSort();
        int []arr={2,1,4,3,9,7,4,8};
//        bubbleSort.sort(arr);
        bubbleSort.sort_bigger(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
