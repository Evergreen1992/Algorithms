package 算法;

import java.util.Arrays;
/**
 * Created by ASDF on 2017/7/3.
 */
public class 二叉搜索树的后序遍历序列 {
    public static boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence.length==0)
            return false;
        if(sequence.length==1)
            return true;
        boolean result=true;
        int root=sequence[sequence.length-1];
        //是否能拆分为两部分。左边部分小于root,右边大于root
        for(int i=sequence.length-2;i>=0;i--){
            if(sequence[i] < root){
                for(int j=0;j<i;j++)
                    if(sequence[j]>=root)
                        result=false;

                //递归判断
                if(result)
                    result=VerifySquenceOfBST(Arrays.copyOfRange(sequence,0,i+1));
                if(result)
                    result=VerifySquenceOfBST(Arrays.copyOfRange(sequence,i+1,sequence.length));
                break;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(VerifySquenceOfBST(new int[]{4,1,3,2,7,9,8,4}));
    }
}