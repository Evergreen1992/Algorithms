package 专项练习.动态规划;

public class 年终奖 {
	//版本1
	public static int getMost(int[][] board) {
		int[][] dp = new int[6][6];
		
        for(int i = 0; i < 6; i ++){
        	for(int j = 0; j < 6; j ++){
        		if(i != 0 && j != 0){
        			dp[i][j] = Math.max(dp[i][j - 1] + board[i][j], dp[i - 1][j] + board[i][j]);
        		}else if(i == 0 && j != 0){
        			dp[0][j] = dp[0][j - 1] + board[0][j];
        		}else if(j == 0 && i != 0){
        			dp[i][0] = dp[i - 1][0] + board[i][0];
        		}else{
        			dp[0][0] = board[0][0];
        		}
        	}
        }
        
        return dp[5][5];
    }
	
	//5549
	public static void main(String[] args) {
		System.out.println(getMost(new int[][]
				{{426,306,641,372,477,409}
				,{223,172,327,586,363,553}
				,{292,645,248,316,711,295}
				,{127,192,495,208,547,175}
				,{131,448,178,264,207,676}
				,{655,407,309,358,246,714}}	
		));
		
	}
}