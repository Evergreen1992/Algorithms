package company.huawei;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
public class Comparator问题 {
	public static void handle(int f, HashMap<Integer,String> map, HashSet<Integer> set){
		ArrayList<Integer> score = new ArrayList<Integer>();
		score.addAll(set);
		
		Collections.sort(score);
		if( f == 0){//高 低
			for(int i = score.size() - 1; i >= 0; i --){
				int s = score.get(i);
				for(String name : map.get(s).split(","))
					System.out.println(name + " " + s);
			}
		}else{
			for(int i = 0; i < score.size(); i ++){
				int s = score.get(i);
				for(String name : map.get(s).split(","))
					System.out.println(name + " " + s);
			}
		}
	}
    public static void main(String[] args) {
    	System.out.println("22222fdsafas\\1111fads11\\fdas".split("\\\\")[2]);
    	
    	Scanner in = new Scanner(System.in);
    	HashMap<Integer, String> map = new HashMap<Integer, String>();
    	HashSet<Integer> s = new HashSet<Integer>();
		while( in.hasNext()){
			int n = in.nextInt();
			int des = in.nextInt();
			for(int i = 0 ; i < n; i ++){
				String name = in.next();
				int score = in.nextInt();
				s.add(score);
				
				if( map.get(score) == null )
					map.put(score, name);
				else{
					if( !map.get(score).contains(name))
						map.put(score, map.get(score) + "," + name);
				}
			}
			handle(des, map, s);
		}
		in.close();
    }
}