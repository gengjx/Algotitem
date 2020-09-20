package sort;

import java.util.Arrays;

public class shellSort {
    public static void main(String[] args) {
        int [] arr ={8,9,1,7,2,3,5,4,6,0};
        shellSort2(arr);
        System.out.println( Arrays.toString(arr));
    }
    public static void shellSort(int [] arr){
        for (int grap = arr.length/2;grap>0;grap/=2){
            int temp =0;
            for (int i=grap ;i<arr.length;i++){
                for (int j =i-grap;j>=0;j-=grap){
                    if (arr[j]>arr[j+grap]){
                        temp =arr[j];
                        arr[j] =arr[j+grap];
                        arr[j+grap] =temp;
                    }
                }
            }
        }

    }

    public static void shellSort2(int [] arr){
        for (int grap = arr.length/2;grap>0;grap/=2){
            for (int i=grap ;i<arr.length;i++){
                int j =i;
                int temp  =arr[j];
                while((j-grap)>=0&&temp<arr[j-grap]){
                    arr [j]= arr[j-grap];
                    j=j-grap;
                }
                arr[j] =temp;
            }
        }

    }
}
