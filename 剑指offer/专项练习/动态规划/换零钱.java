package 专项练习.动态规划;

public class 换零钱 {
	public static int countWays(int[] changes, int n, int x) {
		int[][] dp = new int[n][x+1];//dp[i][j]代表0-i的类型的钱，组成金额j的组合数
		//第一列
		for(int i = 0; i < n; i ++)
			dp[i][0] = 1;
		//第一行
		for(int j = 0; j * changes[0] <= x; j ++)
			dp[0][j * changes[0]] = 1;
		for(int i = 1; i < n; i ++){
			for(int j = 1; j <= x; j ++){
				           //0-i换取j元的种类数     +  不用i，0-i-1换  j-change[i]的种类数
				dp[i][j] = dp[i - 1][j] + (j - changes[i ] >= 0 ? dp[i][j - changes[i]]: 0);
			}
		}
		return dp[n - 1][x];
	}
	public static void main(String[] args) {
		System.out.println(countWays(new int[]{5, 10,  25, 1}, 4, 15));
	}
}