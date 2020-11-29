package sort;

import java.util.Arrays;

/**
 * @Auther: gjx
 * @Date: 2020/11/29 - 11 - 29 - 19:49
 * @Description: sort
 * @version: 1.0
 */
public class CountSortNew {
    public static void main(String[] args) {
        //代排数组
        int [] arr ={7,3,5,8,6,7,4,5};
        //基数排序
        count(arr);
        //排序输出
        System.out.println(Arrays.toString(arr));
    }

    public static void  count(int [] a ){
        //寻找最大值最小值
        int max =a[0];
        int min= a[0];
        for (int i = 1; i <a.length ; i++) {
            if (a[i]>max)
                max =a[i];
            if (a[i]<min)
                min =a[i];
        }
        System.out.println("最大值:"+max+"最小值:"+min);
        int [] count =new int[max-min+1];
        //算出索引计数表
        for (int i = 0; i < a.length; i++) {
            count[a[i]-min]++;
        }
        System.out.println(Arrays.toString(count));
        //计数表2.0
        for (int i = 0; i < count.length; i++) {
            if (i==0){
                count[i] =count[i];
            }
            if (count[i]>0&&i>0){
                count[i] = count[i]+count[i-1];
            }
        }

        System.out.println(Arrays.toString(count));
        //重新开辟数组
        int [] temp = new int[a.length];

        //遍历原数组
        for (int i = a.length-1; i>=0; i--) {
            temp[count[a[i]-min]-1] =a[i];
            count[a[i]-min]--;
        }
        //排序后输出
        System.out.println(Arrays.toString(temp));
        //复制给原数组
        System.arraycopy(temp,0,a,0,a.length);

    }
}
