package com.dsajava.snehal;

import java.util.Scanner;

public class Array_stack {
	private int maxSize;
    private int[] stackArray;
    private int top;
    

    Array_stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    // Check if the stack is full
    public boolean isFull() {
        return top == maxSize - 1;
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Method for insertion in the stack
    public void push(int value) {
        if (isFull()) {
            System.out.println("Sorry, can't insert " + value + " as the stack is full.");
            return;
        }
        top++;
        stackArray[top] = value;
        System.out.println("Value " + value + " inserted at index " + top);
    }

    // Method to remove the top element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Sorry! Can't perform pop operation as the stack is empty.");
            return -1;
        }
        int poppedElement = stackArray[top];
        top--;
        return poppedElement;
    }

    // Method to retrieve the top element from the stack without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty! No elements found!");
            return -1;
        }
        return stackArray[top];
    }

    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.print("give size of an array: ");
    	int size=sc.nextInt();
        Array_stack stk = new Array_stack(size);
        
		/*
		 * int a1=sc.nextInt(); stk.push(a1); System.out.println("Top most element is: "
		 * + stk.peek()); stk.push(20); stk.push(30); stk.push(40);
		 * System.out.println("Top most element is: " + stk.peek());
		 */
        System.out.println("Enter the elements : ");
        for (int i = 0; i < size; i++) {
            int element = sc.nextInt();
            stk.push(element);
        }
        System.out.println();
        System.out.println("stack is full...You cant enter more elements..");
        System.out.println();

        System.out.print("Enter number of elements you want to pop from the array: ");
        int popNum = sc.nextInt();
        for (int i = 0; i < popNum; i++) {
            System.out.println("Element removed: " + stk.pop());
        }
        System.out.println("Elements removed from the stack");       
    }  
}
