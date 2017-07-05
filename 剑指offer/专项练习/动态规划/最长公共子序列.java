package 专项练习.动态规划;

public class 最长公共子序列 {
	public static int findLCS(String A, int n, String B, int m) {
		int[][] dp = new int[n + 1][m + 1];
		for(int i = 1; i <= n; i ++){
			for(int j = 1; j <= m; j ++){
				if( A.charAt(i - 1) == B.charAt(j - 1)){
					dp[i][j] = dp[i-1][j-1] + 1;
				}else{
					dp[i][j] = Math.max(dp[i - 1][j] , dp[i][j - 1] );
				}
			}
		}
		return dp[n][m];
    }
	
	public static void main(String[] args) {
		System.out.println(findLCS("1A2C3D4B56",10,"B1D23CA45B6A",12));
	}

}
