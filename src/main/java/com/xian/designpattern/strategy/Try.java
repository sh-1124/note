package main.java.com.xian.designpattern.strategy;

public class Try {
    public static <T> void sort(T[] arr ,Comparator<T> comparator){

    }
    public static void main(String[] args) {
        int[] arr = {2,5,4,1,3};
        for(int i=0;i<arr.length-1;i++){
            int index=i;
            for(int j=i+1;j<arr.length;j++){//从第一个元素开始，找出最小值的下标
//                if(arr[index]>arr[j]){
//                    index = j;
//                }
                index = arr[j]<arr[index] ? j : index;
            }
            System.out.println(index);
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
