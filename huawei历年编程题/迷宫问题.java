package huawei历年编程题;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.*;

/**
 * Created by ASDF on 2017/7/8.
 */
public class 迷宫问题 {
    private ArrayList<String> path=null;
    public void handle(int[][] arr){
        ArrayList<String> path=new ArrayList<String>();
        findPath(arr,new int[arr.length][arr[0].length],path,0,0);
        System.out.println("..done...");
        for(String it:path)
            System.out.println(it);
    }
    public ArrayList<String> copyList(ArrayList<String> list){
        ArrayList<String> newList=new ArrayList<String>();
        newList.addAll(list);
        return newList;
    }
    public int[][] copyArr(int[][] arr){
        int[][] na=new int[arr.length][arr[0].length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                na[i][j]=arr[i][j];
            }
        }
        return na;
    }
    public void findPath(int[][] arr, int[][] flags, ArrayList<String> list, int x, int y){
        if(x<0 || x>=arr.length || y<0 || y>=arr[0].length)
            return;
        if(flags[x][y]==0){
            list.add("("+x+","+y+")");
            flags[x][y]=1;
            if(x==arr.length-1&&y==arr[0].length-1) {
                this.path = list;
                if(list.size()==9)
                     System.out.println("path size:"+this.path.size());
            }else{
                findPath(arr,copyArr(flags),copyList(list),x+1,y);
                findPath(arr,copyArr(flags),copyList(list),x-1,y);
                findPath(arr,copyArr(flags),copyList(list),x,y+1);
                findPath(arr,copyArr(flags),copyList(list),x,y-1);
            }
        }
    }
    public static void main(String[] args) {
        /*Scanner sc=new Scanner(System.in);
        while(sc.hasNextInt()){
            int m=sc.nextInt();
            int n=sc.nextInt();
            int[][] arr=new int[m][n];
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    arr[i][j]=sc.nextInt();
                }
            }
            new 迷宫问题().handle(arr);
        }*/
        new 迷宫问题().handle(new int[][]{
                {0,1,0,0,0},
                {0,1,0,1,0},
                {0,0,0,0,0},
                {0,1,1,1,0},
                {0,0,0,1,0}
        });
    }
}