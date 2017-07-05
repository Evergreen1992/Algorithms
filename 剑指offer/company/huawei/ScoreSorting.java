package company.huawei;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

public class ScoreSorting {
	public static void handle(TreeMap<Integer, String> score, int o){
		ArrayList<String> list = new ArrayList<String>();
		for( Integer key : score.keySet()){//key由小到大
			String names = score.get(key);
			if( names.contains(",")){
				for(String name : names.split(","))
					list.add(name + " " + key);
			}else{
				list.add(names + " " + key);
			}
		}
		
		if( o == 0){//绛序
			for(int i = list.size() - 1; i >= 0 ; i --)
				System.out.println(list.get(i));
		}else{
			for(int i = 0 ; i < list.size(); i ++)
				System.out.println(list.get(i));
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while( sc.hasNext()){
			int n = sc.nextInt();
			int order = sc.nextInt();
			TreeMap<Integer, String> map = new TreeMap<Integer, String>();
			for(int i = 0 ; i < n; i ++){
				String name = sc.next();
				int score = sc.nextInt();
				if( map.get(score) == null ){
					map.put(score, name);
				}else{
					map.put(score, name + "," + map.get(score));
				}
			}
			handle(map, order);
		}
		sc.close();
	}
}