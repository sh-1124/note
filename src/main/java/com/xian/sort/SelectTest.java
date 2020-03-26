package main.java.com.xian.sort;

public class SelectTest {
    public static void main(String[] args) {
      //  int[] arr = {2,4,3,9,34,5,7,23,11};
        int[] arr={8,4,2,6};
        int d=arr.length/2;
        System.out.println(d);
//        SelectSort.sort(arr);
//        System.out.println(a);
//        for(int i=0;i<arr.length/2;i++){
//            int minIndex=i;
//            int maxIndex=i;
//            for(int j=i+1;j<arr.length-i;j++){
//                minIndex = arr[j]<arr[minIndex]?j:minIndex;
//                maxIndex = arr[j]>arr[maxIndex]?j:maxIndex;
//            }
//            int temp1 = arr[0];
//            arr[0] = arr[minIndex];
//            arr[minIndex] = temp1;
//            int temp2 = arr[arr.length-1];
//            arr[arr.length-1] = arr[maxIndex];
//            arr[maxIndex] = temp2;
//        }
//        for(int k=0;k<arr.length;k++){
//            System.out.print(arr[k]+" ");
//        }
        int c=arr.length/2;
        for(int j=0;j<c;j++){
            int a=j;
            int b=j;
            for(int i=j+1;i<arr.length-j;i++){
                a = arr[i]<arr[a]?i:a;
                b = arr[i]>arr[b]?i:b;
            }
            System.out.println("a:"+a+"b:"+b);
            int temp1 = arr[j];
            arr[j] = arr[a];
            arr[a] = temp1;
            if(j<c-1){//最后一次最大值的换位置已经不需要了，
                // 因为最后一次只剩下最大值和最小值，最小值在上面已经换过了，如果不加判断又会换回去
                int temp2 = arr[arr.length-j-1];
                arr[arr.length-j-1] = arr[b];
                arr[b] = temp2;
            }

            for(int k=0;k<arr.length;k++){
                System.out.print(arr[k]+" ");
            }
        }



//
//        for(int k=0;k<arr.length;k++){
//            System.out.print(arr[k]+" ");
//        }
    }
}
