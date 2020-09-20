package sort;

import java.util.Arrays;

public class heapSort {
    public static void main(String[] args) {
        int [] arr ={4,6,8,5,9};
        heapSort(arr);
    }
    public static  void heapSort(int [] arr){
        //堆
        for (int i=arr.length-1;i>=0;i--){
            adjustHeap(arr,i,arr.length);
        }
        System.out.println("初始化堆:"+Arrays.toString(arr));
        int temp =0;
        while (temp<arr.length-1){
            int t =arr[0];
            arr[0] = arr[arr.length-temp-1];
            arr[arr.length-temp-1] =t;
            adjustHeap(arr, 0,arr.length-temp-1);
            temp ++;
            System.out.println(temp+"轮变化 :  "+Arrays.toString(arr));

        }
    }
    public static void adjustHeap(int [] arr,int i,int length){
        int temp =arr[i];
        for(int k=2*i+1;k<length;k=2*i+1){
            if (k+1<length&&arr[k]<arr[k+1]){
                k++;
            }
            if (arr[k]>temp){
                arr[i] =arr[k];
                i =k;
            }
            else {
                break;
            }
            arr[i] =temp;

        }
    }
}
