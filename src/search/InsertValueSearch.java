package search;

public class InsertValueSearch {
    public static void main(String[] args) {
                int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 , 11, 12, 13,14,15,16,17,18,19,20 };
        int target =binarySerach(arr,5,0,arr.length-1);
        if (target>=0){
            System.out.println("找到:"+target+"号数据就是你想要的寻找的数据");
        }
        else {
            System.out.println("很抱歉没有你想要的数据");
        }
    }

    public static int binarySerach(int [] arr,int target,int left,int right){


        if (left>right){
            return -1;
        }
        int mid = left + (right - left) * (target - arr[left]) / (arr[right] - arr[left]);
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
}
