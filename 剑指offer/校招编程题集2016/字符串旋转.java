package 校招编程题集2016;

public class 字符串旋转 {
	public static String rotateString(String A, int n, int p) {
        String result = "";
        for(int i = p + 1; i < n; i ++)
        	result += A.charAt(i);
        for(int i = 0; i <= p; i ++)
        	result += A.charAt(i);
        return result ;
    }
	//hgf edcba
	//fgh abcde
	public static void main(String[] args) {
		System.out.println(rotateString("ABCDEFGH",8,4));
	}
}