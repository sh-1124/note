package main.java.com.xian.sort;

//选择排序：最简单、最没用(时间复杂度太高、不稳)，有优化空间
//思路：遍历数组找到最小的，将最小的和第一个位置进行交换，依次类推。
//选择排序的时间复杂度为O(n的平方)、空间复杂度O(1) 是不稳定的，比如[5,2,4,5,1]交换后两个5的相对位置发生了变化
public class SelectSort {

    //从小到大的排序方法
    public static int[] sort(int[] arr){
        for(int i=0;i<arr.length-1;i++){//这里减1是因为最后一次不用比较大小，只剩一个了
            int minIndex=i;
            for(int j=i+1;j<arr.length;j++){//找出最小值的下标
                minIndex = arr[j] < arr[minIndex] ? j: minIndex;
            }
            //将最小值和最前面的元素位置互换
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
        return arr;
    }

}
