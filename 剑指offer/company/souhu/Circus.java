package company.souhu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
//马戏团问题。
class Item implements Comparable<Item>{
	public int weight , height ;
	public Item(int weight, int height){
		this.weight = weight;
		this.height = height ;
	}
	public int compareTo(Item o) {
		if( o.weight > this.weight)
			return -1;
		else if( o.weight == this.weight){
			if( o.height > this.height){
				return -1 ;
			}else if(o.height < this.height){
				return 1 ;
			}else
				return 0;
		}else
			return 1;
	}
}
public class Circus {
	public static void proc(ArrayList<Item> list){
		Collections.sort(list);		
		int[] dp = new int[list.size()];
		
		for(int i = 0; i < dp.length; i ++){
			dp[i] = 1 ;
			for(int j = i - 1; j >= 0 ; j --){
				if(((list.get(i).weight == list.get(j).weight)  && (list.get(i).height == list.get(j).height))
					||
					((list.get(i).weight > list.get(j).weight) && (list.get(i).height > list.get(j).height))){
					dp[i] = Math.max(dp[i], dp[j] + 1);
				}
			}
		}
		
		int max = -1 ;
		for(int it : dp){
			if( it > max)
				max = it ;
		}
		System.out.println(max);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Item> list = new ArrayList<Item>();
		for(int i = 0 ; i < n; i ++){
			sc.nextInt();
			Item it = new Item(sc.nextInt(), sc.nextInt());
			list.add(it);
		}
		proc(list);
		sc.close();
	}
}
/**
6
1 65 100
2 75 80
3 80 100
4 60 95
5 82 101
6 81 70
 */