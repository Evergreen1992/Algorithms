package 校招编程题集2016;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class 解密_全排列算法 {
	static ArrayList<String> list = null ;
	public static void handle(String str){
		list = new ArrayList<String>();
		perm(str.toCharArray(), 0, str.toCharArray().length - 1);
		Collections.sort(list);
		for(String it : list)
			System.out.println(it);
	}
	public static void swap(char[] arr, int i1, int i2){
		char temp = arr[i1];
		arr[i1] = arr[i2];
		arr[i2] = temp;
	}
	//WHL
	public static void perm(char[] arr, int begin, int end){
		//递归出口
		if( end == begin){
			String str = "";
			for(int i = 0; i <= end; i ++){
				str += arr[i];
			}
			list.add(str);
			return ;
		}else{
			for(int j = begin; j <= end; j ++){
				swap(arr, begin, j);//for循环将begin~end中的每个数放到begin位置中去 
				perm(arr, begin+1, end);//假设begin位置确定，那么对begin+1~end中的数继续递归  
				swap(arr, begin, j);//换过去后再还原  
			}
		}
	}
	//WHL
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while( sc.hasNextLine()){
			handle(sc.nextLine());
		}
		sc.close();
	}
}