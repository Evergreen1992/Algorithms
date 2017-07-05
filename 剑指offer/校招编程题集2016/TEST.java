package 校招编程题集2016;

public class TEST {
	public static void perm(int[] arr, int begin, int end){
		if( end == begin){
			for(int i = 0; i <= end; i ++){
				System.out.print(arr[i]+" ");
			}
			System.out.println();
			return ;
		}else{
			for(int j = begin; j <= end; j ++){
				swap(arr, begin, j);
				perm(arr, begin + 1, end);
				swap(arr, begin, j);
			}
		}
	}
	public static void swap(int[] arr, int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp ;
	}
	public static void main(String[] args) {
		int[] arr = new int[]{1,2,3};
		perm(arr, 0, arr.length - 1);
	}

}
