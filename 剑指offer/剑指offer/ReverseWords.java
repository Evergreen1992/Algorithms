package 剑指offer;

public class ReverseWords {
	public static String reverse(String item){
		char[] chars = item.toCharArray();
		for(int i = 0 , j = item.length() - 1; i <= j; i ++, j --){
			char tm = chars[i];
			chars[i] = chars[j];
			chars[j] = tm ;
		}
		return new String(chars);
	}
	public static String ReverseSentence(String str) {
		if( str.trim().equals(""))
			return str;
        String result = "";
        String[] strs = reverse(str).split(" ");
        for(int i = 0; i < strs.length; i ++){
        	
        	result += reverse(strs[i]);
        	if( i != strs.length - 1 )
        		result += " ";
        }
        return result ;
    }
	public static void main(String[] args) {
		System.out.println(ReverseSentence(" "));
	}
}
