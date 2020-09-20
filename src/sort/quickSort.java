package sort;

import java.util.Arrays;

public class quickSort {

    public static void main(String[] args) {
        int [] arr = {2,10,8,22,34,5,12,28,21,11};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void  quickSort(int [] arr,int left,int right){
        int privot =arr[(left+right)/2];
        int l =left;
        int r =right;
        int temp =0;
        while(l<r){
            while(arr[l]<privot){
                l++;
            }
            while(arr[r]>privot){
                r--;
            }
            if (l>=r){
                break;
            }
            temp =arr[l];
            arr[l] =arr[r];
            arr[r] =temp;
            if (arr[l]==privot){
                r--;
            }
            if (arr[r] ==privot){
                l++;
            }
        }
        // 如果 l == r, 必须l++, r--, 否则为出现栈溢出
        if (l == r) {
            l += 1;
            r -= 1;
        }
        //向左递归
        if(left < r) {
            quickSort(arr, left, r);
        }
        //向右递归
        if(right > l) {
            quickSort(arr, l, right);
        }


    }
}
