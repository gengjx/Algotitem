package sort;

import java.util.Arrays;

public class chooseSort {
    public static void main(String[] args) {
        int [] arr ={8,4,5,7,13,62};
        chooseSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void chooseSort(int [] arr){
        for (int i=0;i<arr.length-1;i++){
            int nowMax =arr[i];
            int index =i;
             for (int j =i+1;j<arr.length;j++){
                 if (arr[j]<nowMax){
                     nowMax =arr[j];
                     index =j;
                 }
             }
             if (index!=i){
                 arr[index] =arr[i];
                 arr[i] =nowMax;
             }

        }

    }
}
