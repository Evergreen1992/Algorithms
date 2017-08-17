package InterviewAlgorithms;

/**
 * Created by ASDF on 2017/7/10.
 */
public class 像素翻转 {
    public int[][] transformImage(int[][] mat, int n) {
        // 上下翻转
        int tmp=0;
        for(int i=0;i<n/2;i++){
            for(int j=0;j<n;j++){
                tmp=mat[i][j];
                mat[i][j]=mat[n-1-i][j];
                mat[n-1-i][j]=tmp;
            }
        }
        //对角线翻转
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                tmp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=tmp;
            }
        }
        return mat;
    }
    public static void main(String[] args) {
        for(int[] arr: new 像素翻转().transformImage(new int[][]{
                {1,2,3},
                {4,5,6},
                {7,8,9}
        },3)){
            for(int it:arr){
                System.out.print(it+" ");
            }
            System.out.println();
        }
    }
}
