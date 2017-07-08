package huawei历年编程题;

import java.util.Scanner;

/**
 * Created by ASDF on 2017/7/8.
 */
public class IP地址合法识别 {
    public static void handle(String str){
        int a=0, b=0,c=0,d=0,e=0,wrong=0,priva=0;
        //合法性判断
        String ip=str.split("~")[0];
        String mac=str.split("~")[1];
        //ip合法性判断
        String[] ipa=ip.split(".");
        if(ipa.length!=4){
            wrong++;
            return;
        }
        for(String it:ipa){
            boolean fag=false;
            for(char ch:it.toCharArray()){
                if(ch<'0'||c>='9'){
                    wrong++;
                    return;
                }
            }
        }
        //掩码合法性判断

        //类型判断
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            handle(sc.next());
        }
        sc.close();
    }
}