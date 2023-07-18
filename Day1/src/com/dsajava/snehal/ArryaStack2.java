package com.dsajava.snehal;
import java.util.Scanner;

public class ArryaStack2 {
	private int maxSize;
	private int[]stackArray;
	private int top;
	ArryaStack2(int size) {
		maxSize = size;
		stackArray = new int[maxSize];
		top = -1;
	}
	// is Full
	public boolean isFull() {
		return (top == maxSize - 1);
	}
	// is Empty
	public boolean isEmpty() {
		return (top == -1);
	}
	// method for taking user input in stack	
	public void push(int a) {		
		if (isFull()) {
			System.out.println("Sorry can't insert as stack is full.");
			return;
		}	    
		top++;		
	}
	// method for extraction in stack
	public int pop() {
		if (isEmpty()) {
			System.out.println("Sorry! Stack is empty.");
			return -1;
		}
		int poppedElement = stackArray[top];
		top--;
		return poppedElement;
	}
	public int peek() {
		if (isEmpty()) {
			System.out.println("Stack is empty! No elements found.");
			return -1;
		}
		return stackArray[top];
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the array size: ");
		int arr=sc.nextInt();
		ArryaStack2 stk = new ArryaStack2(arr);		
		for(int x=0; x<arr; x++) {
			System.out.println("enter elements: ");
			int element=sc.nextInt();
			stk.push(element);
			System.out.println(stk.stackArray[x]);	
		}		
	}
}