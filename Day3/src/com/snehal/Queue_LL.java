package com.snehal;

public class Queue_LL {
	private Node front;
	private Node rear;
	public static class Node
	{
		int data;
		Node next;
		public Node(int data)
		{
			this.data=data;
			next=null;
		}
	}
	public Queue_LL()
	{
		
		this.front=null;
		this.rear=null;
		
	}
	public boolean isEmpty()
	{
		return front==null;
	}
	public int peek()
	{
		if(isEmpty())
		{
			System.out.println("Queue is Empty! cannot peek...");
			return -1;
		}
		return front.data;
		
	}
	public void enqueue(int data)
	{
		Node newNode=new Node(data);
		if(isEmpty())
		{
			front=newNode;
			rear=newNode;
		}
		else
		{
			rear.next=newNode;
			rear=newNode;
		}
	}
	public int dequeue()
	{
		if(isEmpty())
		{
			System.out.println("Queue is empty! cannot peek...");
			return -1;
		}
		int data=front.data;
		front=front.next;
		if(front==null)
		{
			rear=null;
		}
		return data;
	}
	public void display()
	{
		Node current=front;
		System.out.println("Queue Nodes(front to rear:");
		while(current!=null)
		{
			System.out.print(current.data+"");
			current=current.next;
		}
		System.out.println();
	}
	public static void main(String[] args) {
        Queue_LL queue=new Queue_LL();
        queue.enqueue(100);
        queue.enqueue(100);
        queue.enqueue(100);
        System.out.println("element at front: "+queue.peek());
        queue.display();
        System.out.println("popped element: "+queue.dequeue());
        System.out.println("front: "+queue.front+"\tRear: "+queue.rear.data);
	}
}
