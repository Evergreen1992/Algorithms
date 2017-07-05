package company.aiqiyi;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void handle(String str){
		String[] arr = str.split(" ");
		int count = Integer.parseInt(arr[0]);
		Map<Integer, Double> val = new HashMap<Integer, Double>();
		for(int i = 1; i <= (arr.length - 1)/2; i ++ ){
			val.put(Integer.parseInt(arr[2 * 1 - 1]), 
					Double.valueOf(0.00 + Integer.parseInt(arr[2 * 1 ])/Integer.parseInt(arr[2 * 1 - 1]))
					);
		}
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		handle(sc.nextLine());
		sc.close();
	}

}
