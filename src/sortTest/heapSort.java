package sortTest;

import java.util.Arrays;

public class heapSort {
    public static void main(String[] args) {
        int [] arr ={4,6,8,5,9};
        heap(arr);
    }
    public static void heap(int [] arr){
        for (int i=arr.length/2;i>=0;i--){
            init(arr,i,arr.length);
        }
        System.out.println("初始化: "+ Arrays.toString(arr));

        for (int i=arr.length-1; i>0;i--){
            int temp =arr[i];
            arr[i] =arr[0];
            arr[0] =temp;
            init(arr,0,i);
            System.out.println(i+"轮变化 :  "+Arrays.toString(arr));

        }
    }
    public static void init(int [] arr,int i,int length){
        int temp =arr[i];
        for (int j =2*i+1;j<length;j=2*j+1){
            if (j+1<length&&arr[j]<arr[j+1]){
                j=j+1;
            }
            if (arr[j]>temp){
                arr[i] = arr[j];
                i=j;
                arr[j] =temp;
            }
            else {
                break;
            }
        }
    }
}
