package 剑指offer;

import java.util.*;

public class Main {
	public ArrayList<ArrayList<Integer>> setOfStacks(int[][] ope, int size) {
		ArrayList<Stack<Integer>> sl = new ArrayList<Stack<Integer>>();
		sl.add(new Stack<Integer>());
		for(int i = 0 ; i < ope.length; i ++){
			int op = ope[i][0];
			int num = ope[i][1];
			if( op == 1){
				Stack<Integer> s = sl.get(sl.size() - 1);
				if( s.size() < size)
					s.push(num);
				else if( s.size() >= size){
					Stack<Integer> st = new Stack<Integer>();
					st.push(num);
					sl.add(st);
				}
			}else{
				Stack<Integer> s = sl.get(sl.size() - 1);
				if( s.size() >= 1){
					s.pop();
				}
			}
		}
		
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		for(int i = 0; i < sl.size(); i ++){
			Stack<Integer> s = sl.get(i);
			ArrayList<Integer> al = new ArrayList<Integer>();
			if( s.size() > 0){
				while( !s.isEmpty()){
					al.add(s.pop());
				}
				Collections.reverse(al);
				
			}
		}
		
		return result ;
	}

	public static void main(String[] args) {

	}

}
