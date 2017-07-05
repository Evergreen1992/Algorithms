package 剑指offer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.LinkedBlockingQueue;

public class 之字打印二叉树 {
	public static ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		if( pRoot == null )
			return list;
		
		LinkedBlockingQueue<TreeNode> queue = new LinkedBlockingQueue<TreeNode>();
		TreeNode last = pRoot, currt = null ;
		queue.add(pRoot);
		
		int count = 0 ;
		ArrayList<Integer> cList = new ArrayList<Integer>();
		while(queue.isEmpty() == false){
			TreeNode currtNode = queue.poll();
			cList.add(currtNode.val);
			if( currtNode.left != null ){
				queue.add(currtNode.left);
				currt = currtNode.left ;
			}
			if( currtNode.right != null ){
				queue.add(currtNode.right);
				currt = currtNode.right ;
			}
			if( currtNode == last){//换行
				last = currt ;
				count ++ ;//换行次数
				if( count % 2 == 0){
					Collections.reverse(cList);
				}
				list.add(cList);
				cList = new ArrayList<Integer>();
			}
		}
		
		return list ;
    }
	/*
	        1
	      2   3
	    4  5  6  7
	   8
	 */
	public static void main(String[] args) {
		TreeNode n1 = new TreeNode(1);
		TreeNode n2 = new TreeNode(2);
		TreeNode n3 = new TreeNode(3);
		TreeNode n4 = new TreeNode(4);
		TreeNode n5 = new TreeNode(5);
		TreeNode n6 = new TreeNode(6);
		TreeNode n7 = new TreeNode(7);
		TreeNode n8 = new TreeNode(8);
		n1.left = n2;n1.right = n3;
		n2.left = n4;
		n3.left = n5;n3.right = n6;
		n5.left = n7;n5.right = n8;
		ArrayList<ArrayList<Integer>> list = Print(n1);
		for(ArrayList<Integer> item : list){
			for(Integer ii : item){
				System.out.print(ii + " ");
			}
			System.out.println();
		}
	}

}
