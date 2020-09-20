package search;

import java.util.ArrayList;
import java.util.List;
/*
二分查找算法
思想:
    通过
 */
public class binarySearch {
    public static void main(String[] args) {
//        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 , 11, 12, 13,14,15,16,17,18,19,20 };
//        int target =binarySerach(arr,5,0,arr.length-1);
//        if (target>=0){
//            System.out.println("找到:"+target+"号数据就是你想要的寻找的数据");
//        }
//        else {
//            System.out.println("很抱歉没有你想要的数据");
//        }
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8,8,8,8, 9, 10 , 11, 12, 13,14,15,16,17,18,19,20 };


        //
//		int resIndex = binarySearch(arr, 0, arr.length - 1, 1000);
//		System.out.println("resIndex=" + resIndex);

        List<Integer> resIndexList = binarySerach2(arr, 0, 1, arr.length-1);
        System.out.println("resIndexList=" + resIndexList);
    }
    public static int binarySerach(int [] arr,int target,int left,int right){


        if (left>right){
            return -1;
        }
        int mid = (left + right) /2;
        if (arr[mid]>target){
            return binarySerach(arr,target,0,mid-1);
        }
        else if (arr[mid]<target)
            return binarySerach(arr,target,mid+1,right);
        else{
            System.out.println("找到目标值:"+arr[mid]);
            return mid;
        }
    }
    public static List binarySerach2(int [] arr,int target,int left,int right){
        if (left>right){
            return new ArrayList();
        }
        int mid = (left + right) /2;
        if (arr[mid]>target){
            return binarySerach2(arr,target,0,mid-1);
        }
        else if (arr[mid]<target)
            return binarySerach2(arr,target,mid+1,right);
        else{
            System.out.println("找到目标值:"+arr[mid]);
            ArrayList arrayList =new ArrayList();
            arrayList.add(mid);
            int t =mid -1;
            while(t>0&&arr[t] ==target)
                arrayList.add(t--);
            t =mid +1;
            while(t<=right&&arr[t] ==target)
                arrayList.add(t++);
            return arrayList;
        }
    }
}
