package huawei历年编程题;

import java.util.Scanner;
//回文串两种类型:abba,aba
//依次向后以每个字符为中心，向两侧扩展，判断是偶数类型或奇数类型回文。比较长短。
public class 密码截取 {
    public static boolean judge(String str){
        boolean f=true;
        for(int i=0, j=str.length()-1;i<j;i++,j--){
            if(str.charAt(i)!=str.charAt(j)){
                f=false;
                break;
            }
        }
        return f;
    }
    public static void handle(String str){
        if(str.length()==1){
            System.out.println(1);
            return;
        }
        int maxLen=1;
        for(int i=1;i<str.length()-1;i++){
            //偶数类型
            int start=i,end=i+1, len=0;
            if(str.charAt(start)==str.charAt(end)){
                while(start>=0&&end<str.length()&&str.charAt(start)==str.charAt(end)){
                    start--;
                    end++;
                    len+=2;
                }
                if(len>maxLen)
                    maxLen=len;
            }
            start=i-1;
            end=i+1;
            len=1;
            if(str.charAt(start)==str.charAt(end)){
                while(start>=0&&end<str.length()&&str.charAt(start)==str.charAt(end)){
                    len+=2;
                    start--;
                    end++;
                }
                if(len>maxLen)
                    maxLen=len;
            }
        }
        System.out.println(maxLen);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String pwd=sc.next();
            handle(pwd);
        }
        sc.close();
    }
}