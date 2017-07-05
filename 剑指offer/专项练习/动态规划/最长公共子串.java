package 专项练习.动态规划;

public class 最长公共子串 {
	//dp[i][j]代表A以i,B以j结尾的公共子串的长度。
	public static int findLongest(String A, int n, String B, int m) {
		int[][] dp = new int[n+1][m+1];
		int max = -1;
		for(int i = 1; i <= n; i ++){
			for(int j = 1; j <= m; j ++){
				if( A.charAt(i-1) == B.charAt(j-1)){
					dp[i][j] = dp[i-1][j-1]+1;
					max = Math.max(max, dp[i][j]);
				}
			}
		}
		return max ;
	}
	public static void main(String[] args) {
		System.out.println(findLongest("cacccca",7,"aaacca",6));
	}

}
