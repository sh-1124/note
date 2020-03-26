package main.java.com.xian.sort;

import java.util.Arrays;

public class MergeSortTwo {
    public static void main(String[] args) {
        int[] arr = {1,4,7,8,3,6,9};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr,int left,int right){
        if (left == right) return;
        int mid = left+((right-left)/2);
            sort(arr,left,mid);
            sort(arr,mid+1,right);
        merge(arr,left,mid+1,right);
    }

    public static void merge(int[] arr,int leftPtr,int rightPtr,int rightBound){
        int mid = rightPtr-1;
        int[] temp = new int[rightBound-leftPtr+1];

        int i = leftPtr;//前半截数组的第一个位置上
        int j = rightPtr;//后半截数组的第一个位置上
        int k = 0;

        while (i<=mid && j<=rightBound){
            temp[k++] = arr[i] <= arr[j] ? arr[i++] : arr[j++];
        }

        while (i<=mid) temp[k++]=arr[i++];
        while (j<rightBound) temp[k++]=arr[j++];
        for (int m=0;m<temp.length;m++) arr[leftPtr+m]=temp[m];
    }

    public static void print(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
