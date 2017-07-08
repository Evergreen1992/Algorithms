package 算法;

/**
 * Created by ASDF on 2017/7/3.
 */
import java.util.ArrayList;
import java.util.Collections;

public class 字符串的全排列 {
    public static ArrayList<String> Permutation(String str) {
        ArrayList<String> list=new ArrayList<String>();
        permu(list,str.toCharArray(),0);
        Collections.sort(list);
        return list;
    }
    public static void permu(ArrayList<String> list,char[] arr, int start){
        if(start==arr.length-1){
            String str="";
            for(char c:arr)
                str+=c;
            if(!list.contains(str))
                list.add(str);
        }else{
            for(int i=start;i<=arr.length-1;i++){
                swap(arr,start,i);
                permu(list,arr,start+1);
                swap(arr,start,i);
            }
        }
    }
    public static void swap(char[] arr, int i, int j){
        char t=arr[i];
        arr[i]=arr[j];
        arr[j]=t;
    }
    public static void main(String[] args) {
        for(String it : Permutation("abc")){
            System.out.println(it+" ");
        }
        System.out.println();
    }
}