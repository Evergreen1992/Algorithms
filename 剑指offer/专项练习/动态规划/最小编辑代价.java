package 专项练习.动态规划;

public class 最小编辑代价 {
	//插入、删除和修改
	//设cost[i][j]为将字符串A的1~i位和B的1~j位变为相同时的操作代价
	//注意题目是：A串变为B串 而不是将两个字符串变为相等!!!!!!!!!!!
	public static int findMinCost(String A, int n, String B, int m, int c0, int c1, int c2) {
		int[][] cost = new int[n+1][m+1];
		//边界
		for(int i = 0; i <= m; i ++){//从""变为B[0~i]的代价。只能插入。
			cost[0][i] = c0 * i;
		}
		for(int j = 0; j <= n; j ++){//从A[0~j]变为""的代价。只能删除。
			cost[j][0] = c1 * j ;
		}
		
		for(int i = 1; i <= n; i ++){
			for(int j = 1; j <= m; j ++){
				if( A.charAt(i-1) == B.charAt(j-1)){
					cost[i][j] = cost[i-1][j-1];
				}else{
					//修改A到B
					int cost1 = cost[i][j - 1] + c0;//插入
					int cost2 = cost[i - 1][j] + c1;//删除
					int cost3 = cost[i-1][j-1] + c2;//修改
					cost[i][j] = Math.min(cost1, Math.min(cost2, cost3));
				}
			}
		}
		return cost[n][m];
    }
	public static void main(String[] args) {
		System.out.println(findMinCost("abc",3,"adc",3,5,3,100));
	}
	//ab    adb
	//ad    ad
}