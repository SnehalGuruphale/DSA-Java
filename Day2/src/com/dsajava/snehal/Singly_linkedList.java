package com.dsajava.snehal;

import org.w3c.dom.Node;

public class Singly_linkedList {

	private Node Head;
	
	private static class Node
	{
		private int data;
		private Node next;
		public Node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	public void insert(int data)
	{
		Node newNode=new Node(data);
		if(Head==null)
		{
			Head=newNode;
		}
		else
		{
			Node current=Head;
			while(current.next!=null)
			{
				current=current.next;
			}
			
			current.next=newNode;
		
		}
		System.out.println("Node inserted: "+newNode.data);
	}
	public void display()
	{
		Node current=Head;
		while(current!=null)
		{
			System.out.println(current.data+"\n");
			current=current.next;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singly_linkedList ll=new Singly_linkedList();
		ll.display();
		ll.insert(15);
		ll.insert(16);
		ll.insert(17);
		ll.insert(18);
		ll.insert(19);
		ll.display();
	}

}
