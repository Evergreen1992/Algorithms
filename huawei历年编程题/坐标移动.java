package huawei历年编程题;

import java.util.Scanner;

/**
 * Created by ASDF on 2017/7/8.
 */
public class 坐标移动
{
    public static void handle(String cmd){
        if(cmd==null||cmd.trim().equals("")){
            System.out.println("0,0");
            return;
        }
        int x=0, y=0;
        String[] arr=cmd.split(";");
        for(int i=0;i<arr.length;i++){
            String curr=arr[i];
            if(curr==null||curr.trim().equals("")||curr.length()<=1
                    ||curr.length()>3)
                continue;

            char dir=curr.charAt(0);
            if(dir=='A'||dir=='D'||dir=='W'||dir=='S'){
                //判断是否是数字
                boolean flag=true;
                String num=curr.substring(1,curr.length());

                for(char c:num.toCharArray()){
                    if(c<'0'||c>'9'){
                        flag=false;
                        break;
                    }
                }
                if(!flag)
                    continue;

                if(dir=='A'){
                    x-=Integer.parseInt(num);
                }
                if(dir=='D'){
                    x+=Integer.parseInt(num);
                }
                if(dir=='W'){
                    y+=Integer.parseInt(num);
                }
                if(dir=='S'){
                    y-=Integer.parseInt(num);
                }
            }
        }
        System.out.println(x+","+y);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            handle(sc.next());
        }
        sc.close();
    }
}