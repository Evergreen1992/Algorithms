package 剑指offer;
class TreeLinkNode{
	int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null;

    TreeLinkNode(int val) {
        this.val = val;
    }
}
public class NextNodeInInorderTravel {
	public TreeLinkNode GetNext(TreeLinkNode pNode){
       if( pNode == null )//结点为空，返回空
    	   return null;
       if( pNode.right != null ){//结点右孩子存在，则寻找右孩子的左孩子。
    	   TreeLinkNode curr = pNode.right;
    	   while( curr != null ){
    		   if( curr.left == null )
    			   return curr ;
    		   else
    			   curr = curr.left;
    	   }
       }
       
       while( pNode.next != null ){//结点不为根节点。
    	   if( pNode == pNode.next.left)//结点为父节点左孩子
    		   return pNode.next;
    	   else{//继续找父结点的父结点
    		   pNode = pNode.next;
    	   }
       }
       
       return null ;
    }
	public static void main(String[] args) {

	}

}
