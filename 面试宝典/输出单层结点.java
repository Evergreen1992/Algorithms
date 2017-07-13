package 面试宝典;

import java.util.ArrayList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
/**
 * Created by ASDF on 2017/7/13.
 */
public class 输出单层结点 {
    //层次遍历实现
    public static ListNode getTreeLevel(TreeNode root, int dep) {
        TreeNode nLast=null,last=null;
        ListNode head=null;
        Queue<TreeNode> que=new LinkedBlockingQueue<TreeNode>();
        que.add(root);
        nLast=root;
        int layer=0;
        ArrayList<ListNode> list=new ArrayList<ListNode>();
        while(!que.isEmpty()){
            TreeNode node=que.poll();
            list.add(new ListNode(node.val));
            if(node.left!=null){
                que.add(node.left);
                last=node.left;
            }
            if(node.right!=null){
                que.add(node.right);
                last=node.right;
            }
            if(node==nLast){//当前层结束
                nLast=last;
                layer++;

                if(layer==dep)
                    break;
                list=new ArrayList<ListNode>();
            }
        }
        for(int i=1;i<list.size();i++){
            list.get(i-1).next=list.get(i);
        }
        return list.get(0);
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
        //ListNode node=getlayer(n1,3);
        /*while(node!=null){
            System.out.println(node.val);
            node=node.next;
        }*/
    }
}