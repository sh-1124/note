package main.java.com.xian.sort;
//冒泡排序法：将第一个数和后一个数进行比较，如果大于后面的，则交换位置，继续和后面的比较，依次类推。
//时间复杂度O(n的平方)（两两交换）、空间复杂度O(1)、稳定(两两比较)，在最优环境下（优化后的冒泡排序法，就是下面加上标记的情况）时间复杂度可以降低为O(n)
public class BubbleSort {
    //排序方法
    public static void sort(int[] arr){
        for (int i=1;i<arr.length;i++){//i表示第几轮比较，比如长度为5的数组，总共要比较4次，1,2,3,4；
            // 总共要比较的轮数=数组长度-1
            //设定一个标记，flag=true,若为true,则表示本次比较循环没有交换，说明排序已然完成
            boolean flag=true;
            for (int j=0;j<arr.length-i;j++){//j是第几轮比较的次数=数组长度-比较轮数；
                // 第一轮比较的次数=5-1=4，那么这个循环就要执行四次，也就是j总共取4个值
                // j=0的时候就应该小于5-1，j=1的时候就应该小于等于5-1；
                if (arr[j]>arr[j+1]){ swap(arr,j,j+1); flag=false;}
            }
            if (flag) break;
        }
        print(arr);
    }

    //数组中交换位置，第一个元素大于第二个元素,big和small为索引
    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    //打印数组
    public static void print(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }

    public static void main(String[] args) {
        int [] arr={7,8,2,5,4};
        sort(arr);
    }

}
