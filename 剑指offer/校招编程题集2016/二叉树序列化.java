package 校招编程题集2016;
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
    public TreeNode(int val) {
        this.val = val;
    }
}
public class 二叉树序列化 {
	
	public static String toSequence(TreeNode root) {
		String str="";
		if(root==null){
			return "";
		}else{
			str="(";
			str+=toSequence(root.left);
			str+=toSequence(root.right);
			str+=")";
			return str;
		}
    }
	public static void main(String[] args) {

	}
}