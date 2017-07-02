package 算法;

/**
 * Created by ASDF on 2017/7/2.
 */
//输入两棵二叉树A，B，判断B是不是A的子结构。
class TreeNode{
    int val=0;
    TreeNode left=null;
    TreeNode right=null;
    public TreeNode(int val){
        this.val=val;
    }
}
public class 树的子结构 {
    public static boolean HasSubtree(TreeNode root1,TreeNode root2) {
        boolean result=false;
        if(root1 !=null && root2 !=null){
            result=judge(root1,root2);
        }
        if(result==false)
            result=judge(root1.left,root2);
        if(result==false)
            result=judge(root1.right,root2);
        return result;
    }
    public static boolean judge(TreeNode root1, TreeNode root2){
        if(root1==null&&root2!=null)
            return false;
        if(root1==null&&root2==null)
            return true;
        if(root1.val != root2.val)
            return false;
        return judge(root1.left,root2.left)&&judge(root1.right,root2.right);
    }
    public static void main(String[] args) {

    }
}
