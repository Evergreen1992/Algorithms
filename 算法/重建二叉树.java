package 算法;

import java.util.Arrays;

/**
 * Created by ASDF on 2017/7/3.
 */
//前序遍历和中序遍历的结果中都不含重复的数字
//1,2,4,7,3,5,6,8
//4,7,2,1,5,3,8,6
public class 重建二叉树 {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if(pre.length==0||in.length==0)
            return null;
        TreeNode root=new TreeNode(pre[0]);
        for(int i=0;i<in.length;i++){
            if(pre[0]==in[i]){
                root.left=reConstructBinaryTree(Arrays.copyOfRange(pre,1,i+1),Arrays.copyOfRange(in,0,i));
                root.right=reConstructBinaryTree(Arrays.copyOfRange(pre,i+1,pre.length),Arrays.copyOfRange(in,i+1,in.length));
            }
        }
        return root;
    }
    public static void main(String[] args) {
        int[] arr=new int[]{0,1,2,3,4,5};
        for(int it :Arrays.copyOfRange(arr,1,7))
            System.out.println(it);
    }
}
