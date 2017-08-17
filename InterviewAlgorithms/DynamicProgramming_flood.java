package InterviewAlgorithms;

/**
 * Created by ASDF on 2017/7/14.
 */
public class DynamicProgramming_flood {
    //最短路径
    public int floodFill(int[][] map, int n, int m) {
        int[][] dp=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(map[i][j]==1) {
                    dp[i][j] = 0;
                    continue;
                }

                if(i==0&&j==0)
                    dp[i][j]=0;
                else if(i==0&&j!=0){
                    dp[0][j]=dp[0][j-1]+1;
                }else if(i!=0&&j==0){
                    dp[i][0]=dp[i-1][0]+1;
                }else{
                    dp[i][j]=Math.max(Math.max(dp[i][j],dp[i-1][j]+1),dp[i][j-1]+1);
                }
            }
        }
        return dp[n-1][m-1];
    }
    public static void main(String[] args) {

    }
}