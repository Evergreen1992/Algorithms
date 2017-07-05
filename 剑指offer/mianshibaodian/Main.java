package mianshibaodian;

import java.util.ArrayList;

/*
1 2 3 4
 */
public class Main {
	public static String formatString(String A, int n, char[] arg, int m) {
        String str = "";
        for(int i = 0 ; i < n; i ++){
        	str += A.charAt(i);
        }
        String[] arr = A.split("%s");
        String result = "";
        int count = 0 ;
        for(int i = 0; i < arr.length; i ++){
        	if(i % 2 == 0){
        		result += arr[i] + arg[count++];
        	}else
        		result += arr[i];
        }
        return result ;
    }

	public static void main(String[] args) {
		System.out.println(new Main().formatString("A%sC%sE", 7 ,new char[]{'B','D','F'},3));
	}
}