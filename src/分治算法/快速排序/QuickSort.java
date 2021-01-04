package 分治算法.快速排序;

import org.junit.Test;

import java.util.Arrays;

/**
 * @Auther: gjx
 * @Date: 2020/12/13 - 12 - 13 - 11:10
 * @Description: 分治算法.快速排序
 * @version: 1.0
 */
public class QuickSort {

    public void quick(int [] arr,int left,int right){
        if (left<right){
            int  index =find(arr,left,right);
            quick(arr,left,index);
            quick(arr,index+1,right);
        }


    }

    private int find(int[] arr, int left, int right) {
        int temp  = arr[left];
        int Lindex =left;
        int Rindex =right;
        while(Lindex<Rindex){
            while (Rindex>0&&arr[Rindex]>temp){
                Rindex--;
            }
            arr[Lindex] =arr[Rindex];
            while (Lindex<right&&arr[Lindex]<temp){
                Lindex++;
            }
            arr[Rindex] =arr[Lindex];

        }
        arr[Lindex] =temp;
        return Lindex;


    }

    @Test
    public void testQuickSort(){
        int [] arr={2,1,3,4,5,6,8,9,10,0,-1,100};
        quick(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

}
