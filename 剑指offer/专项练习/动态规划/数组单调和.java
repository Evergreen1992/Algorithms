package 专项练习.动态规划;

public class 数组单调和 {
	public static int calcMonoSum(int[] A, int n) {
        int[] dp = new int[n];//dp[i]表示f(i)
        dp[0] = 0;
        for(int i = 1; i < n; i ++){
        	int val = 0;
        	for(int j = i - 1; j >= 0; j --){
        		if( A[i] >= A[j]){
        			val += A[j];
        		}
        	}
        	dp[i] = val;
        }
        int result = 0 ;
        for(int v : dp)
        	result += v ;
        return result ;
    }
}
