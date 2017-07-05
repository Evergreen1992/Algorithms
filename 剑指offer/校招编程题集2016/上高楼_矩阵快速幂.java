package 校招编程题集2016;

public class 上高楼_矩阵快速幂{
	public static int countWays(int n) {
		int p = n - 1;
		int[][] mat = {{1,1},{1,0}}, base = {{1,0},{0,1}};
		while(p > 0){
			if((p&1) == 1){
				base = mutiple(base, mat);
			}
			mat = mutiple(mat, mat);
			p = p >> 1;
		}
		return (2*base[0][0] + base[1][0]) % 1000000007 ;
    }
	public static int[][] mutiple(int[][] mat1, int[][] mat2){
		mat1[0][0] = mat1[0][0]*mat2[0][0] + mat1[0][1]*mat2[1][0];
		mat1[0][1] = mat1[0][0]*mat2[0][1] + mat1[0][1]*mat2[1][1];
		mat1[1][0] = mat1[1][0]*mat2[0][0] + mat1[1][1]*mat2[1][0];
		mat1[1][1] = mat1[1][0]*mat2[0][1] + mat1[1][1]*mat2[1][1];
		return mat1 ;
	}
	public static void main(String[] args){
		System.out.println(countWays(1));
	}
}