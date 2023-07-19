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
	public void insertAtBeginning(int data,int position)
	{
		
		Node newNode=new Node(data);
		newNode.next=Head;
		Head=newNode;
	}
	public void insertAtSpecific(int data,int position)
	{
		if(position<=0)
		{
			insertAtBeginning(data);
		}
		else
		{
			Node newNode=new Node(data);
			Node current=Head;
			int count=0;
			Node prev=null;
			while(current!=null && count<position)
			{
				prev=current;
				current=current.next;
				count++;
			}
			prev=current;
			current=current.next;
			count++;
		}
		prev.next=newNode;
		newNode.next=current;
	}
}
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
