package 分治算法.归并排序;

import org.junit.Test;

import java.util.Arrays;

/**
 * @Auther: gjx
 * @Date: 2020/12/12 - 12 - 12 - 22:52
 * @Description: 分治算法
 * @version: 1.0
 */
public class MergeSort {

    public void mergeSort(int []arr,int left,int right){
        if (left<right){
            int mid = (right+left)/2;
            mergeSort(arr,left,mid);
            mergeSort(arr,mid+1,right);
            merge(arr,left,mid,right);
        }


    }

    public void merge(int[] arr, int left, int mid, int right) {
        int[] temp =new int[arr.length];
        int Lindex = left;
        int Rindex = mid+1;
        int tindex =left;
        while(  Lindex<=mid && Rindex<=right){
            if (arr[Lindex]<arr[Rindex])
                temp[tindex++] = arr[Lindex++];
            else
                temp[tindex++] = arr[Rindex++];
        }
        while (Lindex<= mid)
           temp[tindex++] =arr[Lindex++];
        while (Rindex <= right)
            temp[tindex++] = arr[Rindex++];

        System.arraycopy(temp,left,arr,left,right-left+1);

    }

    @Test
    public  void test(){
        int [] arr ={8,4,5,7,13,62};
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
}
