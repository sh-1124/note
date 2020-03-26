package main.java.com.xian.sort;
//希尔排序：是先将一定间隔（比如下标为1，4,7,11）的元素进行排序，再将间隔降低，最后间隔必须保证降到1
//空间复杂度O(1)、时间复杂度根据间隔序列的不同而不同，最优时间复杂度普遍认为是O(n的1.3次方)，不稳定
public class ShellSort {
    public static void main(String[] args) {
        int[] arr = {9,6,11,3,5,12,8,7,10,15,14,4,1,13,2};
        sort(arr);
    }
    public static void sort(int[] arr){
        //根据knuth序列来算出数组需要的合适间隔值
        int h=1;
        while(h<=arr.length/3){//h不能超过数组长度的三分之一，因为knuth序列中的间隔是乘以3并且加1的
            h=h*3+1;
        }
        for (int gap=h;gap>0;gap=(gap-1)/3){
            //int gap=4;
            for(int i=gap;i<arr.length;i++){          //注意这里的i++，因为gap的下一个i也要进行间隔的排序
                for (int j=i;j>gap-1;j-=gap){        //j>gap-1是因为如果gap=4,那么j必须大于3也就是从第二个间隔点向前插入排序。// 或者这么想，gap最小为1，gap=1的时候就是普通插入排序，j>0，因此j>gap-1
                    if (arr[j]<arr[j-gap]) swap(arr,j,j-gap);
                }
            }
        }
        print(arr);
    }


    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void print(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}
