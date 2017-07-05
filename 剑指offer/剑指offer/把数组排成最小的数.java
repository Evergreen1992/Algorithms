package 剑指offer;

public class 把数组排成最小的数 {
	public static String PrintMinNumber(int [] numbers) {
		handle(numbers,0);
		return null;
    }
	public static void handle(int[] arr, int start) {
		if( start == arr.length)
			return ;
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int j=start;j<arr.length;j++) {
			swap(arr[start],arr[j]);
			handle(arr,j);
			swap(arr[start],arr[j]);
		}
	}
	public static void swap(int a, int b) {
		int tmp = a;
		a=b;
		b=tmp;
	}
	public static void main(String[] args) {
		System.out.println(PrintMinNumber(new int[] {3,32,321}));
	}
}