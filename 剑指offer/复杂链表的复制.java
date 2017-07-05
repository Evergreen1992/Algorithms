package 算法;

/**
 * Created by ASDF on 2017/7/5.
 */
class RandomListNode{
    int label;
    RandomListNode next=null;
    RandomListNode random=null;
    RandomListNode(int label){
        this.label=label;
    }
}
public class 复杂链表的复制 {
    public static RandomListNode Clone(RandomListNode pHead)
    {
        if(pHead==null)
            return null;
        RandomListNode p=pHead,pNew,pNewHead;
        while(p!=null) {
            RandomListNode tmp = new RandomListNode(p.label);
            tmp.next = p.next;
            p.next = tmp;
            p = tmp.next;
        }
        p=pHead;
        while (p!=null){
            pNew=p.next;
            if(p.random!=null) {
                pNew.random = p.random.next;

            }
            p = pNew.next;
        }
        //拆分
        p=pHead;

        pNewHead=p.next;
        while(p!=null){
            pNew=p.next;
            p.next=pNew.next;
            p=p.next;

            pNew.next=p==null?null:p.next;

        }
        return pNewHead;
    }
    public static void print(RandomListNode node){
        while(node!=null){
            System.out.println(node.label+"  "+(node.random!=null?node.random.label:"null"));
            node=node.next;
        }
    }
    public static void main(String[] args) {
        RandomListNode n1=new RandomListNode(1);
        RandomListNode n2=new RandomListNode(2);
        RandomListNode n3=new RandomListNode(3);
        RandomListNode n4=new RandomListNode(4);
        RandomListNode n5=new RandomListNode(5);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n1.random=n4;
        n2.random=n5;
        n5.random=n1;
        print(n1);
        System.out.println("........");
        print(Clone(n1));
    }
}