package 算法;

import java.util.ArrayList;

/**
 * Created by ASDF on 2017/7/5.
 */

public class 二叉搜索树的第K个结点 {
    ArrayList<TreeNode> list=new ArrayList<TreeNode>();
    TreeNode KthNode(TreeNode pRoot, int k) {
        if(k<=0)
            return null;
        travel(pRoot);
        if(k>list.size())
            return null;
        return list.get(k-1);
    }
    public void travel(TreeNode node){
        if(node==null)
            return;
        travel(node.left);
        list.add(node);
        travel(node.right);
    }

    public static void main(String[] args) {
        TreeNode n1=new TreeNode(8);
        TreeNode n2=new TreeNode(6);
        TreeNode n3=new TreeNode(10);
        TreeNode n4=new TreeNode(5);
        TreeNode n5=new TreeNode(7);
        TreeNode n6=new TreeNode(9);
        TreeNode n7=new TreeNode(11);
        n1.left=n2;
        n1.right=n3;
        n2.left=n4;
        n2.right=n5;
        n3.left=n6;
        n3.right=n7;
        //for(int i=1;i<=7;i++)
            //System.out.println(KthNode(n1,8));
    }
}
