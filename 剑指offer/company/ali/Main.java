package company.ali;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	public static void proce(String str1, String patt){
		//构造匹配规则
		String pattNew = "";
		for(int i = 0 ; i < patt.length(); i ++){
			char curr = patt.charAt(i);
			if( curr == '*'){//任意个字符
				pattNew = pattNew + "[\\s\\S]*"  ;
			}else if( curr == '?'){//一个字符
				pattNew = pattNew + ".{1}" ;
			}else{
				pattNew = pattNew  + "" + curr + "{1}" ;
			}
		}
		//System.out.println(str1 + "  " + pattNew);
	    Pattern pattern = Pattern.compile(pattNew);
	    
	    Matcher matcher = pattern.matcher(str1);
	    boolean rs = matcher.matches();
	    System.out.println(rs == true ? 1 : 0);
	}
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String str1 = sc.nextLine();
    	String str2 = sc.nextLine();
    	proce(str1, str2);
    }

}