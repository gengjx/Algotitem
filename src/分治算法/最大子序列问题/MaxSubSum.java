package 分治算法.最大子序列问题;

import org.junit.Test;

/**
 * @Auther: gjx
 * @Date: 2020/12/13 - 12 - 13 - 12:11
 * @Description: 分治算法.最大子序列问题（暴力解法）
 * @version: 1.0
 */
public class MaxSubSum {
    //暴力算法
    public int maxSubSum(int [] a){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {

            for (int j =i; j <a.length ; j++) {
                int temp =0;
                for (int k = i;k<=j;k++){
                    temp += a[k];
                    max =Math.max(max,temp);
                }

            }

        }
        return max;
    }
    //暴力算法进阶
    public int maxSubSum_2(int [] a){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            int temp =0;
            for (int j =i; j <a.length ; j++) {
                temp += a[j];
                max =Math.max(max,temp);

            }

        }
        return max;
    }
    //分治算法

    public int maxSubSum_3(int [] a,int left,int right){
        if (left == right) {
                return a[left];
        }

        int mid = (left+right)/2;
        int leftsum =maxSubSum_3(a,left,mid);
        int rightsum=maxSubSum_3(a,mid+1,right);
        int maxLeftSum = Integer.MIN_VALUE;
        int leftSum =Integer.MIN_VALUE;
        for (int i =mid;i>=0;i--){
            leftSum+=a[i];
            maxLeftSum =Math.max(leftSum,maxLeftSum);
        }
        int maxRightSum =Integer.MIN_VALUE;
        int rightSum =Integer.MIN_VALUE;
        for (int i=mid+1;i<=right;i++){
            rightSum +=a[i];
            maxRightSum =Math.max(rightSum,maxRightSum);
        }

        return Max(rightsum,leftsum,maxLeftSum+maxRightSum);


    }

    public static int Max(int a,int b, int c) {
        return a > b? (a > c ? a : c ): (b > c ? b : c);
    }

    public static int maxSubArray(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int res = nums[0];
        for(int i = 1;i<nums.length;i++){
            nums[i] = Math.max(nums[i-1]+nums[i], nums[i]);
            if(res<nums[i]){
                res = nums[i];
            }
        }
        return res;
    }


    @Test
    public void testbaoli(){
        int [] arr={-6,6,-4,-3,1};

        System.out.println("暴力算法: "+maxSubSum(arr));
        System.out.println("优化的暴力算法: "+maxSubSum_2(arr));
        System.out.println("分治法: "+maxSubSum_3(arr,0,arr.length-1));
        System.out.println("动态规划算法: "+maxSubArray(arr));

    }

}
