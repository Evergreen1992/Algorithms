package 剑指offer;

import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingQueue;

//按层打印树
public class TravelBTreeByLayer {
	static ArrayList<ArrayList<Integer> > Print(TreeNode root) {
	    ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
	    if( root == null )
	    	return list ;
	    
	    TreeNode last = null, nLast = null ;
	    LinkedBlockingQueue<TreeNode> queue = new LinkedBlockingQueue<TreeNode>();
	    
	    queue.add(root);
	    last = root ;
	    ArrayList<Integer> tempList = new ArrayList<Integer>();
	    
	    while(queue.isEmpty() == false){
	    	TreeNode currNode = queue.poll();
	    	System.out.println(currNode.val);
	    	tempList.add(currNode.val);
	    	
	    	if( currNode.left != null ){
    			queue.add(currNode.left);
    			nLast = currNode.left ;
	    	}
    		if( currNode.right != null ){
    			queue.add(currNode.right);
    			nLast = currNode.right ;
    		}
    		
    		if( currNode == last){//换行
    			System.out.println("........");
    			list.add(tempList);
    			tempList = new ArrayList<Integer>();
    			
	    		last = nLast ;
	    	}
	    	
	    }
	    
	    return list;
    }
	
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
		
		Print(n1);
	}

}
