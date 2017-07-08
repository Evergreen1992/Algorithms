package huawei历年编程题;

import java.util.Scanner;

/**
 * Created by ASDF on 2017/7/8.
 */
public class 迷宫问题 {
    public static void handle(int[][] arr){

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextInt()){
            int m=sc.nextInt();
            int n=sc.nextInt();
            int[][] arr=new int[m][n];
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    arr[i][j]=sc.nextInt();
                }
            }
            handle(arr);
        }
    }
}