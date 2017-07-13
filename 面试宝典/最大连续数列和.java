package 面试宝典;

/**
 * Created by ASDF on 2017/7/13.
 */
public class 最大连续数列和 {
    public int getMaxSum(int[] A, int n) {
        int[] sum=new int[n];
        int tmp=0;
        for(int i=0;i<n;i++){
            tmp+=A[i];
            sum[i]=tmp;
        }
        int[] dp=new int[n];
        dp[0]=sum[0];
        int maxSum=sum[0];
        for(int i=1;i<n;i++){
            int min=sum[0];
            for(int j=0;j<i;j++){
                if(sum[j]<min)
                    min=sum[j];
            }
            dp[i]=Math.max(sum[i]-min,sum[i]);
            if(dp[i]>maxSum)
                maxSum=dp[i];
        }
        return maxSum;
    }
    public static void main(String[] args) {
        System.out.println(new 最大连续数列和().getMaxSum(new int[]{1,2,3,-6,1},5));
    }
}