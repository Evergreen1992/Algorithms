package 面试宝典;

import java.util.ArrayList;

/**
 * Created by ASDF on 2017/7/13.
 */
public class 下一个结点 {
    ArrayList<Integer> list=new ArrayList<Integer>();
    public int findSucc(TreeNode root, int p) {
        findNext(root,p);
        if(list.size()==0)
            return -1;
        int index=list.indexOf(p);
        if(index==-1||index==list.size()-1)
            return -1;
        return list.get(index+1);
    }
    public void findNext(TreeNode node, int p){
        if(node==null)
            return;
        findNext(node.left,p);
        list.add(node.val);
        findNext(node.right,p);
    }
}
