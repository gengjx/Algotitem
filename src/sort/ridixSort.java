package sort;

import java.util.Arrays;

public class ridixSort {
    public static void main(String[] args) {
        int [] arr = {53,3,542,758,14,214};
        ridixSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void ridixSort(int [] arr){
        int max =arr[0];
        for (int i =1;i<arr.length;i++){
            if (arr[i]>max)
                max =arr[i];
        }
        int length =(max+"").length();
        System.out.println("最大长度:"+length);
        int [] [] bucket =new  int [10] [arr.length];
        int []  bucketCount =new  int [10];
        for (int i=0,n=1;i<length;i++,n*=10){
            for (int j =0;j<arr.length;j++){
                bucket[arr[j]/n%10][bucketCount[arr[j]/n%10]] = arr[j];
                bucketCount[arr[j]/n%10]+=1;
            }

            int index =0;
            for (int k=0;k<bucketCount.length;k++){
                if (bucketCount[k]!=0){
                    for (int l =0;l<bucketCount[k];l++){
                        arr[index++] =bucket[k][l];
                    }
                    bucketCount[k]=0;
                }

            }
        }

    }
}
