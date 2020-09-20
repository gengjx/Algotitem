package sortTest;

import java.util.Arrays;

public class Shell {
    public static void main(String[] args) {
        //初级测试
        int [] arr={2,1,3,4,5,6,8,9,10,0};
        shellSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static  void shellSort(int [] arr){
        for (int i=arr.length/2;i>0;i/=2){
            for (int j=i ;j<=arr.length-1;j++ ){
                int insertVal =arr[j];
                while(j-i>=0&&insertVal<arr[j-i]){
                    arr[j] =arr[j-i];
                    j-=i;
                }
                arr[j] = insertVal;
            }
        }
    }
}
