package company.huawei;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicateNumbers {
	public static void remove(int[] arr){
		Set<Integer> set = new HashSet<Integer>();
		for(int item : arr)
			set.add(item);
		List<Integer> list =  new ArrayList<Integer>();
		for(int item : set)
			list.add(item);
		Collections.sort(list);
		for(int item : list)
			System.out.println(item);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while( sc.hasNext()){
			int n = sc.nextInt();
			int[] arr = new int[n];
			for(int i = 0 ; i < n; i ++){
				arr[i] = sc.nextInt();
			}
			remove(arr);
		}	
		sc.close();
	}
}