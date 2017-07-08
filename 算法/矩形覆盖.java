package 算法;

/**
 * Created by ASDF on 2017/6/30.
 */
public class 矩形覆盖 {
    public static int RectCover(int target) {
        if(target<=0)
            return 0;
        if(target==1)
            return 1;
        int[] dp=new int[target];
        dp[0]=1;
        dp[1]=2;
        for(int i=2;i<target;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[target-1];
    }
    public static void main(String[] args) {
        System.out.println(RectCover(1));
    }
}
