package programming2016;
/**
 * Created by ASDF on 2017/7/24.
 */
//[[0,1,0],[2,0,0]],2,3
public class Visit {
    public int countPath(int[][] map, int m, int n) {
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(map[i][j]==1){
                    search(map,0,0);
                    break;
                }
            }
        }
        return 0;
    }
    public void search(int[][] map,int x,int y){
        if(x>=map.length||x<0||y<0||y>=map[0].length)
            return ;
        System.out.println(x+","+y);


        if(map[x][y]==2){
            System.out.println("found...");
        }else if(map[x][y]==0){
            map[x][y]=3;
            search(map,x-1,y);
            search(map,x+1,y);
            search(map,x,y-1);
            search(map,x,y+1);
            map[x][y]=0;
        }
    }
    public static void main(String[] args) {
        new Visit().countPath(new int[][]{
                                        {0,1,0},
                                        {2,0,0}
        },2,3);
    }
}