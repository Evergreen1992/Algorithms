package 剑指offer;

public class 第一个只出现一次的字符 {
	int[] hashTable = new int[256];
	StringBuffer sb = new StringBuffer("");
	public void Insert(char ch){  
		sb.append(ch);
		hashTable[ch] ++ ;
    }

	public char FirstAppearingOnce(){
		char[] arr = sb.toString().toCharArray();
		for(int i = 0 ; i < arr.length; i ++){
			char curr = arr[i];
			if( hashTable[curr] == 1)
				return curr ;
		}
		return '#';
    }
	
	public static void main(String[] args) {
		
	}
}