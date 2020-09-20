package sortTest;

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;

/*
    思想:大泡上浮 小泡下浮
    做法:对于某一组待排序列,我们通过从前向后,依次比较相邻的元素将两者中较大的值向后移的这种操作直到本轮循环结束在第n轮结束时待排序列的逆序的第n位上就是第n大的数
 */
public class Bubble {
    public static void main(String[] args) {
        //初级测试
        int [] arr={2,1,3,4,5,6,8,9,10,0};
        BubbleSort(arr);
        System.out.println(Arrays.toString(arr));
//        //大量数据测试
//        int [] arr =new int[800000000];
//        for (int i=0;i<arr.length;i++){
//            arr[i] =(int) Math.random()*arr.length;
//        }
//        Date date =new Date();
//        SimpleDateFormat simpleDateFormat =new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
//        String time =simpleDateFormat.format(date);
//        System.out.println("当前时间: "+time);
//
//        BubbleSort(arr);
//        time =simpleDateFormat.format(new Date());
//        System.out.println("排序完成的时间:" +time);

    }

    public  static  void BubbleSort(int [] arr){
        for (int i=0;i<arr.length-1;i++){
            boolean flag = false;
            for (int j=1;j<=arr.length-1-i;j++){
                if (arr[j]<arr[j-1]){
                    int temp =arr[j];
                    arr[j] =arr[j-1];
                    arr[j-1] =temp;
                    flag =true;
                }
            }
            if (!flag){
                break;
            }
        }

    }

}
