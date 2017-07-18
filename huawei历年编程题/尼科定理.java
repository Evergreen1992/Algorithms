package huawei历年编程题;

import java.util.Scanner;

/**
 * Created by ASDF on 2017/7/18.
 */
public class 尼科定理 {
    public static void handle(int m){
        int start=m*m-m+1;
        for(int i=1;i<=m;i++){
            System.out.print(start);
            if(i!=m)
                System.out.print("+");
            start+=2;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextInt()){
            int n=sc.nextInt();
            handle(n);
        }
        sc.close();
    }
}