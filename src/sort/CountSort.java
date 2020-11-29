package sort;

import java.util.Arrays;

/**
 * @Auther: gjx
 * @Date: 2020/11/29 - 11 - 29 - 19:33
 * @Description: sort 计数排序1.0
 * @version: 1.0
 */
public class CountSort {
    public static void main(String[] args) {
        //代排数组
        int [] arr ={8,4,5,7,13,62};
        //基数排序
        count(arr);
        //排序输出
        System.out.println(Arrays.toString(arr));
    }

    public static void count(int [] a){
        //寻找最大值
        int max =a[0];

        for (int i1 = 0; i1 < a.length; i1++) {
            if (a[i1]>max){
                max= a[i1];
            }
        }

        System.out.println("最大值:"+max);
        //创建计数数组
        int [] count =new int[max+1];
        //对待排序数字进行计数操作
        for (int i = 0; i < a.length; i++) {
            count[a[i]]++;
        }
        int index =0;
        //去出排序好的数组
        for (int i = 0; i < count.length; i++) {
            while(count[i]>0){
                a[index++] =i;
                count[i]--;
            }
        }

        

    }



}
