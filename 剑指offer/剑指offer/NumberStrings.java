package 剑指offer;
//表示数值的字符串
public class NumberStrings {
	public static boolean isNumeric(char[] str) {
		String string = String.valueOf(str);
		return string.matches("[\\+-]?[0-9]*(\\.[0-9]*)?([eE][\\+-]?[0-9]+)?");
    }
	public static void main(String[] args) {

	}
}