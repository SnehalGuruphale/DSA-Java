package com.snehal;

import java.util.Scanner;

class Node {
    int data;
    Node prev;
    Node next;

    public Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void insertAtLast(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public void insertAtRandom(int data, int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }

        if (index == 0) {
            insertAtBeginning(data);
        } else if (index == size) {
            insertAtLast(data);
        } else {
            Node newNode = new Node(data);
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            newNode.prev = current;
            newNode.next = current.next;
            current.next.prev = newNode;
            current.next = newNode;
            size++;
        }
    }

    public void deleteFromFirst() {
        if (!isEmpty()) {
            if (head == tail) {
                head = null;
                tail = null;
            } else {
                head = head.next;
                head.prev = null;
            }
            size--;
        }
    }

    public void deleteFromLast() {
        if (!isEmpty()) {
            if (head == tail) {
                head = null;
                tail = null;
            } else {
                tail = tail.prev;
                tail.next = null;
            }
            size--;
        }
    }

    public void deleteFromRandom(int index) {
        if (isEmpty() || index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }

        if (index == 0) {
            deleteFromFirst();
        } else if (index == size - 1) {
            deleteFromLast();
        } else {
            Node current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            current.prev.next = current.next;
            current.next.prev = current.prev;
            size--;
        }
    }

    public boolean contains(int data) {
        Node current = head;
        while (current != null) {
            if (current.data == data) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

public class DoublyLinkedListMain {
    public static void main(String[] args) {
        DoublyLinkedList linkedList = new DoublyLinkedList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n-- Doubly Linked List Operations --");
            System.out.println("1. Insert at the beginning");
            System.out.println("2. Insert at the end");
            System.out.println("3. Insert at a specific position");
            System.out.println("4. Delete from the beginning");
            System.out.println("5. Delete from the end");
            System.out.println("6. Delete from a specific position");
            System.out.println("7. Display");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the element to insert at the beginning: ");
                    int dataBeginning = scanner.nextInt();
                    linkedList.insertAtBeginning(dataBeginning);
                    break;
                case 2:
                    System.out.print("Enter the element to insert at the end: ");
                    int dataEnd = scanner.nextInt();
                    linkedList.insertAtLast(dataEnd);
                    break;
                case 3:
                    System.out.print("Enter the element to insert: ");
                    int dataRandom = scanner.nextInt();
                    System.out.print("Enter the position to insert (0-based index): ");
                    int index = scanner.nextInt();
                    linkedList.insertAtRandom(dataRandom, index);
                    break;
                case 4:
                    linkedList.deleteFromFirst();
                    break;
                case 5:
                    linkedList.deleteFromLast();
                    break;
                case 6:
                    System.out.print("Enter the position to delete (0-based index): ");
                    int deleteIndex = scanner.nextInt();
                    linkedList.deleteFromRandom(deleteIndex);
                    break;
                case 7:
                    System.out.println("Doubly Linked List: ");
                    linkedList.display();
                    break;
                case 8:
                    scanner.close();
                    System.out.println("Exiting the program. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
