package 剑指offer;

public class RemoveDuplicateInList {
	//1->2->3  ->3->4->4->5
	public static ListNode deleteDuplication(ListNode pHead){
		if( pHead.next == null )
			return pHead;
		
		int hValue = -1;
		if( pHead.val != -1)
			hValue = -1;
		else
			hValue = -2 ;
		ListNode p = new ListNode(hValue), pNext = null ;
		p.next = pHead;
		pNext = pHead ;
		
		ListNode newHead = new ListNode(hValue);
		newHead.next = pHead ;
		
		while( pNext != null ){
			while( pNext.next != null && pNext.val == pNext.next.val)
				pNext = pNext.next;
			if( p.next != pNext){
				pNext = pNext.next;
				p.next = pNext;
			}else{
				p = pNext ;
				pNext = pNext.next;
			}
		}
		
		return newHead.next ;
    }
	public static void main(String[] args) {
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(3);
		ListNode n5 = new ListNode(4);
		ListNode n6 = new ListNode(4);
		ListNode n7 = new ListNode(5);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n6.next = n7;
		ListNode node = deleteDuplication(n1);
		while(node != null ){
			System.out.println(node.val + " -> ");
			node = node.next ;
		}
	}
}