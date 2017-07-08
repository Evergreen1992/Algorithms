package huawei历年编程题;

import java.util.Scanner;

public class 合唱队 {
    public static void handle(int[] arr){
        int[] dp1=new int[arr.length];
        int[] dp2=new int[arr.length];
        int[] arr2=new int[arr.length];
        int[] dpSum=new int[dp1.length];

        dp1[0]=1;
        for(int i=1;i<arr.length;i++){
            int max=1;
            dp1[i]=1;
            for(int j=0;j<i;j++){
                if(arr[i]>arr[j]){
                    dp1[i]=Math.max(dp1[i],dp1[j]+1);
                }
            }

        }
        //从后往前计算dp
        int k=0;
        for(int i=arr2.length-1;i>=0;i--){
            arr2[k++]=arr[i];
        }
        dp2[0]=1;
        for(int i=1;i<arr2.length;i++){
            int max=1;
            dp2[i]=1;
            for(int j=0;j<i;j++){
                if(arr2[i]>arr2[j]){
                    dp2[i]=Math.max(dp2[i],dp2[j]+1);
                }
            }

        }

        for(int i=0;i<dp1.length;i++){
            dpSum[i]=dp1[i]+dp2[dp2.length-1-i];
        }
        int min=Integer.MAX_VALUE;
        for(int it:dpSum){
            if((arr.length-it)<min){
                min=arr.length-it;
            }
        }
        System.out.println(min+1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextInt()){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            handle(arr);
        }
        sc.close();
    }
}