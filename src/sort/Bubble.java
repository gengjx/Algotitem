package sort;

import com.sun.deploy.util.SyncAccess;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Bubble {

    public static void main(String[] args) {
        int [] test =new int[800000000];
        for (int i=0;i<800000000;i++){
            test[i] =(int)Math.random()*800000000;
        }
        Date data1 = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date1Str = simpleDateFormat.format(data1);
        System.out.println("排序前的时间是=" + date1Str);

        bubbleSort(test);
        //System.out.println(Arrays.toString(arr));

        Date data2 = new Date();
        String date2Str = simpleDateFormat.format(data2);
        System.out.println("排序后的时间是=" + date2Str);
    }
    public static  void bubbleSort(int [] arr){
        for (int i=0;i<arr.length-1;i++){
            int temp =0;
            boolean flag =false;
            for (int j=0;j<arr.length-1-i;j++){
                if (arr[j]>arr[j+1]){
                    temp =arr[j];
                    arr[j] =arr[j+1];
                    arr[j+1] =temp;
                    flag =true;
                }
            }

            if (flag==false){
                break;
            }
        }
    }
}
