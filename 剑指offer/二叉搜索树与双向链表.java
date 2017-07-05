package 算法;


import java.util.ArrayList;

/**
 * Created by ASDF on 2017/7/5.
 */
//10,6,14,4,8,12,16
public class 二叉搜索树与双向链表 {
    ArrayList<TreeNode> list=new ArrayList<TreeNode>();
    public TreeNode Convert(TreeNode pRootOfTree) {
        handle(pRootOfTree);
        if(list.size()==0)
            return null;
        for(int i=0;i<list.size()-1;i++){
            list.get(i).right=list.get(i+1);
        }
        for(int i=list.size()-1;i>=1;i--){
            list.get(i).left=list.get(i-1);
        }
        return list.get(0);
    }
    public void handle(TreeNode node){
        if(node==null)
            return;
        handle(node.left);
        list.add(node);
        handle(node.right);
    }
    public static void main(String[] args) {
        TreeNode n1=new TreeNode(10);
        TreeNode n2=new TreeNode(6);
        TreeNode n3=new TreeNode(14);
        TreeNode n4=new TreeNode(4);
        TreeNode n5=new TreeNode(8);
        TreeNode n6=new TreeNode(12);
        TreeNode n7=new TreeNode(16);
        n1.left=n2;
        n1.right=n3;
        n2.left=n4;
        n2.right=n5;
        n3.left=n6;
        n3.right=n7;
        TreeNode n=new 二叉搜索树与双向链表().Convert(n1);
        while(n!=null){
            System.out.println(n.val);
            n=n.right;
        }
    }
}
