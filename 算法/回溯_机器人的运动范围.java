package 算法;

/**
 * Created by ASDF on 2017/7/5.
 */
public class 回溯_机器人的运动范围 {
    int count=0;
    public int movingCount(int threshold, int rows, int cols)
    {
        int[][] flags=new int[rows][cols];
        judge(flags,0,0,rows,cols,threshold);
        return count;
    }
    public void judge(int[][] flags, int x, int y,int row, int col,int thresh){

        if(x<0 || x>=row || y<0 || y>=col || flags[x][y] == 1)
            return ;

        int sum=0, i=x,j=y;
        while(i!=0){
            sum+=i%10;
            i/=10;
        }
        while(j!=0){
            sum+=j%10;
            j/=10;
        }
        flags[x][y]=1;
        if(sum<=thresh) {
            count++;
            judge(flags,x+1,y,row,col,thresh);
            judge(flags,x-1,y,row,col,thresh);
            judge(flags,x,y-1,row,col,thresh);
            judge(flags,x,y+1,row,col,thresh);
        }

    }

    public static void main(String[] args) {
        System.out.println(new 回溯_机器人的运动范围().movingCount(10,1,100));
    }
}
