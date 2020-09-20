package sortTest;

import java.util.Arrays;

public class Insert {
    public static void main(String[] args) {
        //初级测试
        int [] arr={2,1,3,4,5,6,8,9,10,0};
       InsertSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void InsertSort(int [] arr){
        for (int i=1;i<arr.length;i++){
            int insertVal =arr[i];
            int insertFlag=i-1;
            while(insertFlag>=0&&arr[insertFlag]>insertVal){
                arr[insertFlag+1]=arr[insertFlag];
                insertFlag--;
            }
            arr[insertFlag+1] =insertVal;
        }
    }
}
