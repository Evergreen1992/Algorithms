package 校招编程题集2016;

public class 分苹果 {
	public static int getInitial(int n) {
        for(int i = n + 1;; i ++){
        	int apples = i ;
        	int bears = n;
        	while( bears > 0){
        		if( apples % n == 1){
        			apples = apples - apples/n - 1;
        			bears -- ;
        		}else
        			break;
        	}
        	if( bears == 0)
        		return i ;
        }
    }
	public static void main(String[] args) {
		System.out.println(getInitial(2));
	}
}