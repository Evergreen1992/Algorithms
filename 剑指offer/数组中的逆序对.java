package 算法;

//归并排序思想。时间复杂度o(nlogn)空间复杂度o(n)
public class 数组中的逆序对 {
    static int count=0;
    // 1 3 5 7   2 4 6 8
    public static int InversePairs(int [] array) {
        int[] a=new int[array.length];
        mergeSort(array,0,array.length-1,a);
        return count%1000000007;
    }
    public static void merge(int[] a,int lo, int mid, int hi,int[] tmp){
        int i=lo, j=mid+1,k=lo, count=0;
        while (i<=mid&&j<=hi){
            if(a[i]<=a[j]){
                tmp[k++]=a[i++];
            }else {
                tmp[k++] = a[j++];
                count++;
            }
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
    public static void main(String[] args) {
        int[] a=new int[]{1,2,3,4,5,6,7,0};
        System.out.println(InversePairs(a));
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