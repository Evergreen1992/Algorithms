package 面试宝典;

/**
 * Created by ASDF on 2017/7/10.
 */
class TreeNode{
    int val=0;
    TreeNode left=null;
    TreeNode right=null;
    public TreeNode(int val){
        this.val=val;
    }
}
public class BTreeBalaceCheck {
    private boolean flag=true;
    public boolean isBalance(TreeNode root) {
        depth(root);
        return flag;
    }
    public int depth(TreeNode node){
        if(node==null)
            return 0;
        int left=depth(node.left);
        int right=depth(node.right);
        if(Math.abs(left-right)>1)
            flag=false;
        return left>right?left+1:right+1;
    }

    public static void main(String[] args) {
        System.out.println();
    }
}
