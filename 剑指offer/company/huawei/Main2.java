package company.huawei;

import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {
	public static int judge(String a, String b){
		String[] c = {"2","3","4","5","6","7","8","9","10","J","Q","K","A","joker","JOKER"};
		ArrayList<String> list = new ArrayList<String>();
		for(String it : c)
			list.add(it);
		return list.indexOf(a) > list.indexOf(b) ? 0 : 1 ;
	}
	//ERROR
	//单牌   对子  顺子  三个  炸弹  对王
	//2 3 4 5 6 7 8 9 10 J Q K A  joker JOKER
	public static void compare(String str1, String str2){
		String[] a1 = str1.split(" ");
		String[] a2 = str2.split(" ");
		int a = a1.length;
		int b = a2.length;
		if( str1.equals("joker JOKER") || str2.equals("joker JOKER")){
			System.out.println("joker JOKER");
			return ;
		}
		
		if( a == 4 || b == 4){
			if( a == b){
				System.out.println(judge(a1[0],a2[0]) == 0 ? str1 : str2);
				return ;
			}else{
				System.out.println(a == 4 ? str1 : str2);
				return ;
			}
		}
		
		if( a == b){
			System.out.println(judge(a1[0],a2[0]) == 0 ? str1 : str2);
		}else{
			System.out.println("ERROR");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()){
			String str = sc.nextLine();
			compare(str.split("-")[0], str.split("-")[1]);
		}
		sc.close();
	}
}