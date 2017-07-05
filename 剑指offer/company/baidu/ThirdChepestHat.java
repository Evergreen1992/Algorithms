package company.baidu;

import java.util.Scanner;
/*
10
10 10 10 10 20 20 30 30 40 40
 */
public class ThirdChepestHat {
	public static void thridChepest(int[] prices){
		if( prices.length < 3){
			System.out.println(-1);
			return ;
		}
		int chep1 = prices[0], chep2 = Integer.MAX_VALUE, chep3 = Integer.MAX_VALUE;
		for(int i = 0 ; i < prices.length; i ++){
			if( prices[i] < chep1){
				chep1 = prices[i];
			}else if( prices[i] > chep1 && prices[i] < chep2){
				chep2 = prices[i];
			}else if( prices[i] > chep2 && prices[i] < chep3){
				chep3 = prices[i];
			}
		}
		System.out.println(chep3 == Integer.MAX_VALUE ? -1 : chep3);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0 ; i < n; i ++){
			arr[i] = sc.nextInt();
		}
		thridChepest(arr);
		sc.close();
	}
}