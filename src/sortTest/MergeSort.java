package sortTest;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int [] arr={2,1,3,4,5,6,8,9,10,0,-1,100};
        msort(arr,0,arr.length-1,new int[arr.length]);
        System.out.println(Arrays.toString(arr));
    }
    public static void merge(int [] arr,int left,int mid,int right,int [] temp){
        int leftl =left;

        int rlow =mid+1;
        int t =0;
        while (leftl<=mid&&rlow<=right){
           if(arr[leftl]<=arr[rlow]){
               temp[t++]= arr[leftl++] ;
           }
           else {
               temp[t++]  = arr[rlow++];
           }

        }
        while (leftl<=mid)
            temp[t++]=arr[leftl++] ;
        while (rlow<=right)
            temp[t++]=arr[rlow++];
        System.arraycopy(temp,0,arr,left,right-left+1);

    }
    public static void msort(int [] arr ,int left,int right,int [] temp){
        if (left<right){
            int mid =(left+right)/2;
            msort(arr,left,mid,temp);
            msort(arr,mid+1,right,temp);
            merge(arr,left,(left+right)/2,right,temp);
        }
    }

}
