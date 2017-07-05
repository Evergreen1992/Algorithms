package 剑指offer;

public class MaxContinuosArrSum {
	public static int FindGreatestSumOfSubArray(int[] array) {
		if( array.length == 0)
			return 0;
		int maxSubSum = array[0], result = array[0];
		for(int i = 1; i < array.length; i ++){
			maxSubSum = Math.max(maxSubSum + array[i], array[i]);
			result = Math.max(result, maxSubSum);
		}
		return result ;
    }
	public static void main(String[] args) {
		int[] arr = new int[]{6,-3,-2,7,-15,1,2,2};
		System.out.println(FindGreatestSumOfSubArray(arr));
		/**
		int res = array[0]; //记录当前所有子数组的和的最大值
		int max=array[0];//包含array[i]的连续数组最大值
		for (int i = 1; i < array.length; i++) {
			max=Math.max(max+array[i], array[i]);
			res=Math.max(max, res);
		}
		return res;
		 */
	}
}