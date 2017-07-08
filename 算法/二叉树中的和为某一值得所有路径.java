package 算法;

/**
 * Created by ASDF on 2017/7/3.
 */
import java.util.*;
public class 二叉树中的和为某一值得所有路径 {
    public static ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        ArrayList<ArrayList<Integer>> list=new ArrayList<ArrayList<Integer>>();
        find(root,list,new ArrayList<Integer>(),target);
        return list;
    }
    public static void find(TreeNode node, ArrayList<ArrayList<Integer>> list, ArrayList<Integer> path,int target){
        if(node==null)
            return;
        int sum=0;
        path.add(node.val);
        for(int it:path) {
            sum += it;
        }
        if(sum==target&&node.left==null&&node.right==null){
            list.add(path);
            return;
        }

        find(node.left,list,new ArrayList<Integer>(path),target);
        find(node.right,list,new ArrayList<Integer>(path),target);
    }
    public static void main(String[] args) {
        //10,5,12,4,7
        TreeNode t1=new TreeNode(10);
        TreeNode t2=new TreeNode(5);
        TreeNode t3=new TreeNode(12);
        TreeNode t4=new TreeNode(4);
        TreeNode t5=new TreeNode(7);
        t1.left=t2;
        t1.right=t3;
        t2.left=t4;
        t2.right=t5;
        FindPath(t1,22);
    }
}
