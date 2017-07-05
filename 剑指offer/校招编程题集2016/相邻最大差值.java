package 校招编程题集2016;

public class 相邻最大差值 {
	public static int findMaxDivision(int[] A, int n) {
		int min = A[0], max = A[0];
		for(int it : A){
			if( it < min)
				min = it;
			if( it > max)
				max = it ;
		}
		int[] arr = new int[max - min + 1];
		for(int it : A)
			arr[it - min] ++ ;
		int count = 1, maxGap = 0;
		for(int i = 0 ; i < arr.length; i ++){
			if( arr[i] == 0){
				count ++ ;
				if(count > maxGap )
					maxGap = count ;
			}else
				count = 1;
		}
		return maxGap ;
    }
	//桶排序
	public static void main(String[] args) {
		System.out.println(findMaxDivision(new int[]{9,3,1,10},4));
	}
}