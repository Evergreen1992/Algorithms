package 剑指offer;

public class 对称二叉树 {
	public boolean isSymmetrical(TreeNode pRoot){
		if( pRoot == null )
			return true;
		return comRoot(pRoot.left, pRoot.right);
	}
	public boolean comRoot(TreeNode left, TreeNode right){
		if( left == null )
			return right == null ;
		if( right == null )
			return left == null ;
		if( left.val != right.val)
			return false;
		return comRoot(left.right, right.left) &&
				comRoot(left.left, right.right);
	}
	public static void main(String[] args) {

	}

}
