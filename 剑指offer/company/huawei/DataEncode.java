package company.huawei;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DataEncode {
	public static void encode(String key, String str){
		Set<Character> set = new HashSet<Character>();
		String ke = "";
		for( char c : key.toCharArray())
			if( !set.contains(c)){
				set.add(c);
				ke += c ;
			}
				
		for(int i = 0; i < 26; i ++){
			if( !set.contains((char)('a' + i))){
				set.add((char)('a' + i));
				ke = ke + (char)('a' + i);
			}	
		}
		String res = "";
		for(char c : str.toCharArray()){
			res += ke.charAt(c - 'a');
		}
		System.out.println(res);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()){
			encode(sc.nextLine(), sc.nextLine());
		}
		sc.close();
	}

}
//abcdefghijklmnopqrstuvwxyz
//nihaobcdefgjklmpq
