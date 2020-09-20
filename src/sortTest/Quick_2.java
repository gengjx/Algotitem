package sortTest;

import java.util.Arrays;

public class Quick_2 {
    public static void main(String[] args) {
        int [] arr={2,1,3,4,5,6,8,9,10,0,-1,100};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static  int getIndex(int [] arr,int low,int high){
        int temp =arr[low];
        while(low<high){
            while(low<high&&arr[high]>=temp){
                high--;
            }
            arr[low] =arr[high];
            while(low<high&&arr[low]<temp){
                low++;
            }
            arr[high]=arr[low];
        }
        arr[low] = temp;
        return low;

    }

    public static void quickSort(int [] arr,int low,int high){
        if (low<high){
            int index =getIndex(arr,low,high);
            quickSort(arr,low,index-1);
            quickSort(arr,index+1,high);
        }
    }
}
