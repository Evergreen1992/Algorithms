package 算法;

/**
 * Created by ASDF on 2017/7/6.
 */
class ListNode{
    int val;
    ListNode next=null;
    ListNode(int val){
        this.val=val;
    }
}
public class 链表环的入口结点 {
    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        if(pHead==null||pHead.next==null)
            return null;
        ListNode pre=pHead, front=pHead.next;
        while(front!=null){
            pre.next=null;
            pre=front;
            front=front.next;
        }
        return pre;
    }
}
