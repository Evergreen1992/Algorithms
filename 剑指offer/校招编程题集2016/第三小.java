package 校招编程题集2016;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class 第三小 {
	/*
10
10 10 10 10 20 20 30 30 40 40
	 */
	public static void handle(int[] arr){
		Set<Integer> set = new HashSet<Integer>();
		for(int it : arr)
			set.add(it);
		if( set.size() < 3){
			System.out.println(-1);
		}else{
			ArrayList<Integer> list = new ArrayList<Integer>();
			list.addAll(set);
			Collections.sort(list);
			System.out.println(list.get(list.size() - 3));
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			int n = sc.nextInt();
			int[] arr = new int[n];
			for(int i = 0; i <n; i ++)
				arr[i] = sc.nextInt();
			handle(arr);
		}
		sc.close();
	}
}