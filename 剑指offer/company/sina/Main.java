package company.sina;

import java.util.Stack;

class Node{
	public int val ;
	public Node(int val){
		this.val = val ;
	}
	public Node left = null ;
	public Node right = null ;
}
public class Main {
	//二叉树先序遍历，非递归方法
	public static void xianxu(Node root){
		System.out.println("先序遍历");
		Stack<Node> s = new Stack<Node>();
		s.push(root);
		
		while( s.isEmpty() == false){
			Node curr = s.pop();
			System.out.println(curr.val);
			if( curr.right != null )
				s.push(curr.right);
			if( curr.left != null )
				s.push(curr.left);
		}
	}
	//中序遍历
	public static void zhongxu(Node root){
		System.out.println("中序遍历");
		Node curr = root ;
		Stack<Node> s = new Stack<Node>();
		s.push(curr);
		
		while( s.isEmpty() == false || curr != null ){
			while( curr.left != null ){
				s.push(curr.left);
				curr = curr.left ;
			}
			Node node = s.pop();
			System.out.println(node.val);
			if( node.right != null ){
				curr = node.right ;
				s.push(curr);
			}
			
		}
	}
	//后序遍历
	public static void houxu(Node root){
		Stack<Node> s1 = new Stack<Node>();
		Stack<Node> s2 = new Stack<Node>();
		
		s1.push(root);
		while( s1.isEmpty() == false){
			Node curr = s1.pop();
			s2.push(curr);
			if( curr.left != null )
				s1.push(curr.left);
			if( curr.right != null )
				s1.push(curr.right);
		}
		
		while( s2.isEmpty() == false){
			System.out.println(s2.pop().val);
		}
	}
	
	
	public static void main(String[] args){
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		Node n6 = new Node(6);
		Node n7 = new Node(7);
		n1.left = n2; n1.right = n3;
		n2.left = n4; n2.right = n5;
		n3.left = n6; n3.right = n7;
		//xianxu(n1);
		//zhongxu(n1);
		houxu(n1);
	}
}