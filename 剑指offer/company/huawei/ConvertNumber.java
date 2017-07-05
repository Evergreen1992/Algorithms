package company.huawei;

import java.util.Scanner;

public class ConvertNumber {
	public static void convert(String num){
		//0-9 A B C D E F
		int flag = 1 , result = 0;
		for(int i = num.length() - 1; i >= 0; i --){
			char curr = num.charAt(i);
			if( curr == 'x')
				break;
			if( curr >= '0' && curr <= '9'){
				result += flag * ( curr - '0');
			}else{
				result += flag * ( curr - 'A' + 10);
			}
			flag *= 16 ;
		}
		System.out.println(result);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			convert(sc.next());
		}
		sc.close();
	}
}