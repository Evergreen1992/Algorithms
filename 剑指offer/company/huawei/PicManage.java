package company.huawei;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PicManage {
	public static void sort(String str){
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(char c : str.toCharArray())
			list.add((int)c);
		Collections.sort(list);
		for(int it : list)
			System.out.print((char)it);
		System.out.println();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()){
			sort(sc.nextLine());
		}
		sc.close();
	}
}