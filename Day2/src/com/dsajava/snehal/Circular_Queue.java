package com.dsajava.snehal;

public class Circular_Queue<T> {

	//take 5 variables
	private T[] queue;
	private int rear;
	private int front;
	private int size;
	private int capacity;

	//create constructor for it
	public Circular_Queue(int capacity)
	{
		queue=(T[]) new Object[capacity];
		rear=-1;
		front=-1;
		size=0;
		this.capacity=capacity;
	}

	//create method to check whether queue is empty or not
	public boolean isFull()
	{
		return size==capacity;
	}

	//create method to check whether queue is full or not
	public boolean isEmpty()
	{
		return size==0;
	}

	//create method to insert elements into the queue
	public void enqueue(T element)
	{
		if(isFull())
		{
			throw new IllegalStateException("Queue is full");
		}
		rear=(rear+1)%capacity;
		queue[rear]=element;
		if(front==-1)
		{
			front=rear;
		}
		System.out.println("element added "+element);
		size++;
	}
	
	//create method to delete elements from the queue
	public T dequeue()
	{
       if(isEmpty())
       {
    	   throw new IllegalStateException("Queue is empty");
       }
       T element=queue[front];
       queue[front]=null;
       
       if(front==rear)
       {
    	   front=-1;
    	   rear=-1;
       }
       else
       {
    	   front=(front+1)%capacity;
       }
       size--;
       return element;
	}



	public static void main(String[] args) {
       Circular_Queue<String> queue=new Circular_Queue(5);
       queue.enqueue("Apple");
       queue.enqueue("Guava");
       queue.enqueue("Orange");
       queue.enqueue("Kiwi");
       
       System.out.println("Element popped: "+queue.dequeue());
       queue.dequeue();
       queue.enqueue("Mango");
       queue.enqueue("grapes");
       queue.enqueue("chikku");
       
	}

}
