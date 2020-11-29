package sort;

import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {
        int [] arr ={101,34,119,1};
        insetSort(arr);
        System.out.println( Arrays.toString(arr));


    }
    public static  void insetSort(int [] arr){
        for (int i=1;i<arr.length;i++){
            int insertVal =arr[i];
            int insetIndex =i-1;
            while(insetIndex>=0&&arr[insetIndex]>insertVal){
                arr[insetIndex+1] =arr[insetIndex--];
            }
            arr[insetIndex+1] =insertVal;
        }


    }
}
