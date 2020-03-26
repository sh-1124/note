package main.java.com.xian.sort;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {1,4,7,8,3,6,9};
        sort(arr,0,arr.length-1);
    }

    public static void sort(int[] arr,int left,int right){
        int mid = (left+right)/2;
        //分成两半
        sort(arr,left,mid);//左边排序
        sort(arr,mid+1,right);//右边排序
        merge(arr,left,mid+1,right);//合并
        print(arr);

    }
//合并的方法，leftPtr左指针，rightPtr右指针，rightBound右边界
    public static void merge(int[] arr,int leftPtr,int rightPtr,int rightBound){
        int mid = rightPtr-1;
        int[] temp = new int[rightBound-leftPtr+1];          //定义新数组，存放排序完成的元素
        int i = leftPtr;                                    //i是左半区的指针
        int j = rightPtr;                                //j是右半区的指针
        int k = 0;                                        //k是新数组的指针
        while(i<=mid && j<=rightBound){             //将较小的数先移动到数组中
            temp[k++] = arr [i] < arr[j] ? arr[i++] : arr[j++];    //简化书写
//            if (arr[i]<arr[j]){
//                arr[k] = arr [i];
//                k++;
//                i++;
//            }else if (arr[i]>arr[j]){
//                arr[k] = arr[j];
//                k++;
//                j++;
//            }
        }
        while (i<=mid) temp[k++] = arr[i++];    //将左半区剩下的移动到数组中
        while (j<=rightBound) temp[k++] = arr[j++];  //将右半区剩下的移动到数组中
        for (int m=0;m<temp.length;m++) arr[leftPtr+m] = temp [m];; //将排好序的数组赋值给原先的数组

    }

    public  static void print(int[] arr){
       for (int i=0;i<arr.length;i++){
           System.out.print(arr[i]+" ");
       }

    }
}
