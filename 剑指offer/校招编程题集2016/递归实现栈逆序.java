package 校招编程题集2016;

public class 递归实现栈逆序 {
	public static int[] reverseStackRecursively(int[] stack, int size) {
		reve(stack, 0);
		return stack ;
	}
	public static void reve(int[] arr, int n){
		if( n >= arr.length/2)
			return ;
		reve(arr, n+1);
		int temp = arr[n];
		arr[n] = arr[arr.length-n-1];
		arr[arr.length-n-1]=temp;
		return ;
	}
	
	public static void main(String[] args) {
		for(int it : reverseStackRecursively(new int[]{1, 2,3,4,5},5)){
			System.out.println(it);
		}
	}
}