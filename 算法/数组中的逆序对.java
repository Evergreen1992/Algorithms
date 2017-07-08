package 算法;

//归并排序思想。时间复杂度o(nlogn)空间复杂度o(n)
public class 数组中的逆序对 {
    int count=0;
    // 1 3 5 7   2 4 6 8
    public int InversePairs(int [] array) {
        if(array==null||array.length==0||array.length==1)
            return 0;

        mergeSort(array,0,array.length-1);
        return count%1000000007;
    }
    public void merge(int[] a,int lo, int mid, int hi ){
        int[] tmp=new int[hi-lo+1];

        int i=lo, j=mid+1,k=0;
        while (i<=mid&&j<=hi){
            if(a[i]<=a[j]){
                tmp[k++]=a[i++];
            }else {
                tmp[k++] = a[j++];
                count=count+mid-i+1;//核心代码！！！！！！
                count=count%1000000007;
            }
        }
        while (i<=mid)
            tmp[k++]=a[i++];
        while (j<=hi)
            tmp[k++]=a[j++];
        //数组复制
        for(k=0;k<tmp.length;k++){
            a[lo+k]=tmp[k];
        }
    }
    public void mergeSort(int[] a, int lo, int hi ){
        if(lo<hi){
            int mid=(lo+hi)/2;
            mergeSort(a,lo,mid );
            mergeSort(a,mid+1,hi);
            merge(a,lo,mid,hi );
        }
    }
    public static void main(String[] args) {
        int[] a=new int[]{};
        System.out.println(new 数组中的逆序对().InversePairs(a));
    }
}














//归并排序代码
class MergeSortSolution{
    public static void merge(int[] a,int lo, int mid, int hi,int[] tmp){
        int i=lo, j=mid+1,k=lo;
        while (i<=mid&&j<=hi){
            if(a[i]<=a[j]){
                tmp[k++]=a[i++];
            }else
                tmp[k++]=a[j++];
        }
        while (i<=mid)
            tmp[k++]=a[i++];
        while (j<=hi)
            tmp[k++]=a[j++];
    }
    public static void mergeSort(int[] a, int lo, int hi, int[] tmp){
        if(lo<hi){
            int mid=(lo+hi)/2;
            mergeSort(a,lo,mid,tmp);
            mergeSort(a,mid+1,hi,tmp);
            merge(a,lo,mid,hi,tmp);
        }
    }
}