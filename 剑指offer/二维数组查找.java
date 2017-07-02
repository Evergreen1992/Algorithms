package 算法;

/**
 * Created by ASDF on 2017/6/30.
 */
public class 二维数组查找 {
    public static boolean Find(int target, int [][] array) {
        int x=0, y=array[0].length-1;
        while (x>=0 && x<array.length && y>=0 && y <array[0].length){
            if(array[x][y] == target) {
                return true;
            }else if (array[x][y] > target){
                y--;
            }else if (array[x][y] < target){
                x++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(Find(5,new int[][]{
                {1,2,3,4,5,6,7},
                {2,3,4,5,6,7,8},
                {3,4,5,6,7,8,9},
                {4,5,6,7,8,9,10},
        }));
    }
}