package 专项练习.动态规划;

public class 背包问题 {
	public static void proce(int volum){
		int[] weight = {0,2,2,6,5,4};
		int[] value =  {0,6,3,5,4,6};
		int[][] dp = new int[weight.length + 1][volum];
		int maxValue = -1;
		//状态转换max(dp[i-1][j], dp[i-1][j-w[i]] + w[i])
		for(int i = 1; i <= volum; i ++){//体积
			int currMax = 0;
			for(int k = 0 ; k < weight.length; k ++){
				if( dp[][] > currMax){
					currMax = dp[][];
				}
			}
			for(int j = 1; j <= weight.length; j ++){
				if( i > weight[j]){
					dp[j][i] = Math.max(currMax, dp[j - 1][i - weight[j]] + value[j]);
				}
			}
		}
	}
	public static void main(String[] args) {
		proce(10);
	}
}