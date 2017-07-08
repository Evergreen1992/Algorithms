package 算法;

/**
 * Created by ASDF on 2017/6/30.
 */
public class 变态跳台阶 {
    //1 2 4 8 16 ...
    public int JumpFloorII(int target) {
        if(target<=0)
            return 0;
        return 1<<(target-1);
    }
    public static void main(String[] args) {

    }
}
