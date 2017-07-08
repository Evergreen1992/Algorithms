package 算法;

public class 数组全排列 {
    int min=Integer.MAX_VALUE;
    public String PrintMinNumber(int [] numbers) {
        handle(numbers,0,numbers.length-1);
        return min+"";
    }
    public void handle(int[] arr, int begin, int end) {
        if(begin==end){
            String num="";
            for(int i=0;i<=end;i++)
                num+=arr[i];
            if(Integer.parseInt(num)<min)
                min=Integer.parseInt(num);
            return;
        }else{
            for(int j=begin;j<=end;j++){
                swap(arr,begin,j);
                handle(arr,begin+1,end);
                swap(arr,begin,j);
            }
        }
    }
    public void swap(int[] arr, int a, int b) {
        int tmp = arr[a];
        arr[a]=arr[b];
        arr[b]=tmp;
    }
    public static void main(String[] args) {
        System.out.println(new 数组全排列().PrintMinNumber(new int[] {3,32,321}));
    }
}