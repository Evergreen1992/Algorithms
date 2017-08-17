package programming2016;

import java.util.Scanner;

/**
 * Created by ASDF on 2017/7/6.
 */
public class 字符串计数 {
    public static void handle(String s1,String s2,int start,int end){

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String s1=sc.next();
            String s2=sc.next();
            int s=sc.nextInt();
            int e=sc.nextInt();
            handle(s1,s2,s,e);
        }
        sc.close();
    }
}