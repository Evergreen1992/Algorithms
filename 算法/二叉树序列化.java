package 算法;


/**
 * Created by ASDF on 2017/7/5.
 */

public class 二叉树序列化 {
    int index=-1;
    String Serialize(TreeNode root) {
        StringBuffer sb=new StringBuffer();
        if(root==null){
            sb.append("#,");
            return sb.toString();
        }
        sb.append(root.val+",");
        sb.append(Serialize(root.left));
        sb.append(Serialize(root.right));
        return sb.toString();
    }
    TreeNode Deserialize(String str) {
        if(str==null)
            return null;
        return handle(str.split(",") );
    }
    TreeNode handle(String[] arr ) {
        index++;
        if(index>arr.length)
            return null;

        TreeNode node=null;
        if(!arr[index].equals("#")){
            node=new TreeNode(Integer.parseInt(arr[index]));
            node.left=handle(arr );
            node.right=handle(arr );
        }
        return node;
    }
    static void print(TreeNode node){
        if(node==null)
            return;
        System.out.print(node.val+" ");
        print(node.left);
        print(node.right);
    }
    public static void main(String[] args) {
        TreeNode n1=new TreeNode(5);
        TreeNode n2=new TreeNode(4);
        TreeNode n3=new TreeNode(3);
        TreeNode n4=new TreeNode(2);

        n1.left=n2;
        n2.left=n3;
        n3.left=n4;

    }
}
/*
     5
   4  #
  3 #
 2
 */