package 专项练习.动态规划;

public class 最短排序 {
	//从前往后找出最后一个变小的数字位置，从后往前找出最后一个变大的数字位置
	public static int findShortest(int[] A, int n) {
		int e = 0;
		//从前往后找出最后一个变小的数字的位置
		int max = A[0];
		for(int i = 0; i < n; i ++){
			if( A[i] < max)
				e = i ;
			if( A[i] > max)
				max = A[i];
		}
		//从后往前找出最后一个变大的数字的位置
		int min = A[n - 1], s = n - 1;
		for(int i = n - 1; i >= 0; i --){
			if(A[i] > min)
				s = i;
			if(A[i] < min)
				min = A[i];
		}
		if( e == 0 && s == n - 1)
			return 0;
		return e - s + 1;
    }
	public static void main(String[] args) {
		System.out.println(findShortest(new int[]{1,2,10,1,8,9}, 6));
	}
}