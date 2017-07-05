package company.网易;

import java.util.Scanner;
//
/*
3 
2 3 5

4
1 5 5 9

2 4 6 6
2 2 4 6 14
 */
//小易有n块砖块，每一块砖块有一个高度。小易希望利用这些砖块堆砌两座相同高度的塔。为了让问题简单，砖块堆砌就是简单的高度相加，
//某一块砖只能使用在一座塔中一次。小易现在让能够堆砌出来的两座塔的高度尽量高，小易能否完成呢。 
public class 堆砖块 {
	public static void handle(int[] arr){
		int sum = 0 ;
		for(int item : arr)
			sum += item ;
		int[][] dp = new int[arr.length + 1][sum + 1];
		for (int i = 1; i <= sum; i++) {
            dp[0][i] = Integer.MIN_VALUE;
        }
		
		for(int i = 1 ; i <= arr.length; i ++){
			int curr = arr[i - 1];//当前砖块
			for(int j = 0 ; j < sum; j ++){//j代表高度差（放上当前砖块后的高度差）
				dp[i][j] = dp[i - 1][j];//舍弃当前砖块
				if( j + curr <= sum){
					//放在低塔任是低塔
					dp[i][j] = Math.max(dp[i][j], dp[i - 1][j + curr] + curr);
				}
				if( curr - j >= 0){
					//低塔变为高塔
					dp[i][j] = Math.max(dp[i][j], dp[i - 1][curr - j] + curr - j);
				}else{
					//放在高塔
					dp[i][j] = Math.max(dp[i][j], dp[i - 1][j - curr]);
				}
			}
		}
		System.out.println(dp[arr.length][0] > 0 ? dp[arr.length][0] : -1);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0 ; i < n; i ++){
			arr[i] = sc.nextInt();
		}
		handle(arr);
		sc.close();
	}
}