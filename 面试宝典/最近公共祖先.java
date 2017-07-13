package 面试宝典;

import java.util.ArrayList;

/**
 * Created by ASDF on 2017/7/13.
 */
public class 最近公共祖先 {
    public static int getLCA(int a, int b) {
        ArrayList<Integer> la=new ArrayList<Integer>();
        int cla=1;
        while(a>=1){
            if(a%2==1){
                la.add((a-1)/2);
                a=(a-1)/2;
            }else{
                la.add(a/2);
                a=a/2;
            }
        }
        while(b>=1){
            if(la.contains(b)) {
                cla = b;
                break;
            }
            if(b%2==1){
                b=(b-1)/2;
            }else{
                b=b/2;
            }
        }
        return cla;
    }

    public static void main(String[] args) {
        System.out.println(getLCA(9,7));
    }
}