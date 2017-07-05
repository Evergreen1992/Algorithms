package 剑指offer;

public class CyclicCountNumber {
	public static int LastRemaining_Solution(int n, int m) {
		int removedCount = 0, result = -1, index = -1;
		int[] flags = new int[n];
		
		while(true){
			for(int i = 0 ; i < n; i ++){
				if( flags[i] == 0){
					index ++ ;
				}
				
				if( index == m - 1){
					removedCount ++ ;//移除该元素
					if( removedCount == n){
						result = i ;
					}
					flags[i] = 1 ;
					index = -1 ;
				}
			}
			if( removedCount == n){
				break ;
			}
		}
		
		return result ;
    }
	public static void main(String[] args) {
		System.out.println(LastRemaining_Solution(10, 3));
	}
}