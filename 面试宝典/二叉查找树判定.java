package 面试宝典;


import java.util.ArrayList;

/**
 * Created by ASDF on 2017/7/13.
 */
public class 二叉查找树判定 {
    ArrayList<Integer> list=new ArrayList<Integer>();
    public boolean checkBST(TreeNode root) {
        travel(root);
        for(int i=1;i<list.size();i++){
            if(list.get(i)<list.get(i-1))
                return false;
        }
        return true;
    }
    public void travel(TreeNode node){
        if(node==null)
            return;
        travel(node.left);
        list.add(node.val);
        travel(node.right);
    }

    public static void main(String[] args) {
        TreeNode n1=new TreeNode(1);
        TreeNode n2=new TreeNode(2);
        TreeNode n3=new TreeNode(3);
        TreeNode n4=new TreeNode(4);
        TreeNode n5=new TreeNode(5);
        TreeNode n6=new TreeNode(6);
        TreeNode n7=new TreeNode(7);
        n3.left=n6;
        n3.right=n7;
        n1.left=n2;
        n1.right=n3;
        n2.left=n4;
        n2.right=n5;
        System.out.println(new 二叉查找树判定().checkBST(n1));
    }
}
