package company.网易;

import java.util.Scanner;

//3+5*7
public class 奇怪表达式求值 {
	public static void calculate(String str){// 3+5*7
		int result = 0 , temp ;
		for(int i = 0 ; i < str.length(); i ++){
			char curr = str.charAt(i);
			if( curr == '+'){
				if( i == 1){
					result = (str.charAt(i - 1) - '0') + (str.charAt(i + 1) - '0');
				}else{
					result = result + (str.charAt(i + 1) - '0');
				}
			}else if( curr == '-'){
				if( i == 1){
					result = (str.charAt(i - 1) - '0') - (str.charAt(i + 1) - '0');
				}else{
					result = result - (str.charAt(i + 1) - '0');
				}
			}else if( curr == '*'){
				if( i == 1){
					result = (str.charAt(i - 1) - '0') * (str.charAt(i + 1) - '0');
				}else{
					result = result * (str.charAt(i + 1) - '0');
				}
			}
		}
		System.out.println(result);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		calculate(sc.nextLine());
		sc.close();
	}
}