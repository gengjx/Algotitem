package sortTest;

import java.util.Arrays;

public class ridix {

    public static void main(String[] args) {
        int [] arr = {533,333,543,753,143,213};
        ridixSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void ridixSort(int [] arr){

        int maxvalue =arr[0];
        for (int i =1 ; i<arr.length ;i++){
            if (arr[i]>maxvalue)
                maxvalue =arr[i];
        }

        System.out.println("最大的数据为: " +maxvalue);
        int length = (maxvalue+"").length();
        System.out.println("遍历次数为: "+length);

        for (int i =0,n=1;i<length;i++,n*=10){
            int [] []buckSoket =new int[10][arr.length];
            int [] buckCount =new int[10];
            for (int j = 0;j<arr.length;j++){
                int div = arr[j] /n %10;
                System.out.println("扫描到的："+arr[j]+" 对应位数上的数字:"+div);
                buckSoket[div][buckCount[div]] =arr[j];
                buckCount[div]++;
            }
            int index =0;
            for (int k =0;k<buckCount.length;k++){
                if (buckCount[k] >0){
                    for (int l =0;l<buckCount[k] ;l++){
                        arr[index++] =buckSoket[k][l];
                    }
                    buckCount[k] =0;
                }
            }

        }





    }


}
