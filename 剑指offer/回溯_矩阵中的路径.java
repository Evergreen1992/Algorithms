package 算法;

import java.util.Arrays;

/**
 * Created by ASDF on 2017/7/5.
 */
public class 回溯_矩阵中的路径 {
    boolean contains=false;//是否包含
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str)
    {
        if(str==null||str.length>matrix.length)
            return false;

        String target=new String(str);//目标路径
        int[][] flags=new int[rows][cols];
        char[][] chars=new char[rows][cols];
        int k=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                chars[i][j]=matrix[k++];
            }
        }

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(chars[i][j]==str[0] && !contains){//搜索起点
                    handle(flags,chars,i,j,rows,cols,0,target);
                    flags=new int[rows][cols];
                }
            }
        }

        return contains;
    }

    public void handle(int[][] flags, char[][] chars,
                       int x, int y,//当前位置
                       int rows,int cols,//矩阵行和列
                       int position, //当前需要判断的字符
                       String target//目标路径
                                                ){
        if(contains)
            return;
        if(x>=0&&x<=rows-1&&y>=0&&y<=cols-1 && flags[x][y]==0){
            if(chars[x][y]==target.charAt(position)){
                flags[x][y]=1;
                if(position==target.length()-1)
                    contains=true;
                else{
                    handle(flags,chars,x-1,y,rows,cols,position+1,target);
                    handle(flags,chars,x+1,y,rows,cols,position+1,target);
                    handle(flags,chars,x,y-1,rows,cols,position+1,target);
                    handle(flags,chars,x,y+1,rows,cols,position+1,target);
                }
            }else{//不匹配。回退。
                return;
            }
        }
        return ;

    }

    public static void main(String[] args) {
        System.out.println(new 回溯_矩阵中的路径().
                hasPath("ABCEHJIGSFCSLOPQADEEMNOEADIDEJFMVCEIFGGS".toCharArray(),5,8,
                        "SGGFIECVAASABCEHJIGQEM".toCharArray()));
    }
}