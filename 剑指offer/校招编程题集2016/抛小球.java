package 校招编程题集2016;

public class 抛小球 {
	public static int calcDistance(int A, int B, int C, int D) {
		return 3*(A+B+C+D);
    }
	public static void main(String[] args) {
		System.out.println(calcDistance(100, 90, 80, 70));
	}
}