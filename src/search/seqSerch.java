package search;

public class seqSerch {
    public static void main(String[] args) {
        int [] arr ={8,4,5,7,13,62};
        int target =seqSerch(arr,8);
        if (target>=0){
            System.out.println("找到:"+target+"号数据就是你想要的寻找的数据");
        }
        else {
            System.out.println("很抱歉没有你想要的数据");
        }
    }
    public static int seqSerch(int [] arr,int target){
        for (int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }

        return  -1;
    }
}
