package 算法;

/**
 * Created by ASDF on 2017/7/2.
 */
/*
1   2  3  4
5   6  7  8
9  10 11  12
13 14 15  16
 */
import java.util.ArrayList;
//每次打印第一行。然后旋转。
public class 顺时针打印矩阵 {
    public static int[][] reverse(int[][] arr){
        if(arr.length <= 1)
            return null;
        int[][] matrix=new int[arr[0].length][arr.length-1];
        for(int j=arr[0].length-1 , m= 0;j >= 0; j-- , m++){
            for(int i= 1, n= 0; i < arr.length; i ++, n++){
                matrix[m][n]=arr[i][j];
            }
        }
        return matrix;
    }
    public static ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        while(true){
            //打印第一行
            for(int j=0; j<matrix[0].length;j++) {
                list.add(matrix[0][j]);
            }
            //旋转。
            matrix=reverse(matrix);
            if(matrix == null)
                break;
        }
        return list;
    }
    public static void main(String[] args) {
        for(int it : printMatrix(new int[][]{
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        })){
            System.out.println(it+" ");
        }
    }
}