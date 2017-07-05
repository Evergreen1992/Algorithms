package 校招编程题集2016;

import java.util.ArrayList;
import java.util.Scanner;

public class 兔子藏洞 {
	public static void handle(int x, int n){
		int[] flags = new int[20];
		int index = x;//洞从1开始编号
		int inc = 1 ;
		//1 2 3 4 5 6 7 8 19 20			
		for(int i = 1; i <= n; i ++){
			if( index > 20){
				index = index % 20;
			}
			//System.out.println(index-1);
			flags[index > 0 ? index - 1 : 0] = 1;
			inc++ ;
			index = index + inc;
		}
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < flags.length; i ++){
			if( flags[i] == 0)
				list.add(i+1);
		}
		if(list.size() == 0)
			System.out.println(-1);
		else{
			for(int i = 0; i < list.size(); i ++){
				System.out.print(list.get(i)+" ");
				
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		while( sc.hasNextInt()){
			handle(sc.nextInt(), sc.nextInt());
		}
		sc.close();
	}
}