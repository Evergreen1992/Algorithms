package 算法;
/**
 * Created by ASDF on 2017/7/3.
 */
import java.util.Stack;
public class 栈的压入弹出序列 {
    public static boolean IsPopOrder(int [] pushA,int [] popA) {
        Stack<Integer> stack=new Stack<Integer>();
        if(pushA.length==0||popA.length==0)
            return false;
        int j=0;
        for(int i=0;i<pushA.length;i++){
            stack.push(pushA[i]);
            while (!stack.isEmpty()&&stack.peek()==popA[j]){
                stack.pop();
                j++;
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        System.out.println(IsPopOrder(new int[]{1,2,3,4,5},
        new int[]{4,5,3,2,1}));
    }
}