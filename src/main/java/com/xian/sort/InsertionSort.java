package main.java.com.xian.sort;
//插入排序法：将一个数组的第0个元素看做成是有序的，将第1个和第0个比较，如果小于这个，则将第0个和第1个交换，
// 依次类推，相当于是将后面无序的数据插入到前面有序的数据中去。
//时间复杂度O(n的平方)、空间复杂度O(1)、稳定、最优时间复杂度O(n)（如果已经排好序，内层循环只执行1次）
public class InsertionSort {
    public static void sort(int[] arr){
        for(int i=1;i<arr.length;i++){
            for (int j=i;j>0;j--){
                if (arr[j]<arr[j-1]) swap(arr,j,j-1);
            }
//            int j=i;
//            while(j>0 && arr[j]<arr[j-1]){
//                swap(arr,j,j-1);
//                j--;
//            }
        }
        print(arr);
    }


    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
