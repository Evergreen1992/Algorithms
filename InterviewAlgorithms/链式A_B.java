package InterviewAlgorithms;

import java.util.ArrayList;

/**
 * Created by ASDF on 2017/7/12.
 */
class ListNode{
    int val;
    ListNode next=null;
    ListNode(int val){
        this.val=val;
    }
}
public class 链式A_B {
    public boolean isPalindrome(ListNode pHead) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        while(pHead!=null){
            list.add(pHead.val);
            pHead=pHead.next;
        }
        boolean f=true;
        for(int i=0, j=list.size()-1;i<j;i++,j--){
            if(list.get(i)!=list.get(j)){
                f=false;
                break;
            }
        }
        return f;
    }
    public ListNode plusAB(ListNode a, ListNode b) {
        if(a==null)
            return b;
        if(b==null)
            return a;

        ArrayList<Integer> l1=new ArrayList<Integer>();
        ArrayList<Integer> l2=new ArrayList<Integer>();
        ArrayList<Integer> list=new ArrayList<Integer>();
        ListNode p1=a, p2=b;
        while(p1!=null){
            l1.add(p1.val);
            p1=p1.next;
        }
        while (p2!=null){
            l2.add(p2.val);
            p2=p2.next;
        }
        int len=l1.size()>=l2.size()?l1.size():l2.size();
        int flags=0;//进位
        for(int i=0;i<len;i++){
            int sum=0;
            if(i<l1.size()){
                sum+=l1.get(i);
            }
            if(i<l2.size()){
                sum+=l2.get(i);
            }
            sum+=flags;
            list.add(sum%10);
            flags=sum/10;
        }
        if(flags!=0)
            list.add(flags);
        ListNode head=new ListNode(list.get(0)), pre=head;
        for(int i=1;i<list.size();i++){
            ListNode node=new ListNode(list.get(i));
            pre.next=node;
            pre=node;
        }

        return head;
    }

    public static void main(String[] args) {
        ListNode l1=new ListNode(7);
        ListNode l2=new ListNode(4);
        ListNode l3=new ListNode(0);
        ListNode l4=new ListNode(7);
        ListNode l5=new ListNode(5);
        l1.next=l2;l2.next=l3;l3.next=l4;l4.next=l5;

        ListNode n1=new ListNode(2);
        ListNode n2=new ListNode(7);
        ListNode n3=new ListNode(2);
        ListNode n4=new ListNode(3);
        ListNode n5=new ListNode(4);
        n1.next=n2;n2.next=n3;n3.next=n4;n4.next=n5;

        ListNode p=new 链式A_B().plusAB(l1,n1);
        while(p!=null){
            System.out.println(p.val);
            p=p.next;
        }
        System.out.println();
    }
}