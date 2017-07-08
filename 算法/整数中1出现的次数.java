package 算法;

/**
 * Created by ASDF on 2017/6/30.
 */
public class 整数中1出现的次数 {//暴力求解

    public static int NumberOf1Between1AndN_Solution(int n) {
        int count=0;
        for(int i=1;i<=n;i++){
            for(int j=0;j<(i+"").length();j++)
                if((i+"").charAt(j)=='1')
                    count++;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(NumberOf1Between1AndN_Solution(13));
    }
}
