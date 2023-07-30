import java.util.Scanner;

class Node 
{
    int data;
    Node next;

    Node(int data) 
    {
        this.data = data;
        this.next = null;
    }
}

class LinkedList 
{
    private Node head;

    // Insertion at specific index
    public void insertAtIndex(int data, int index) 
    {
        if (index < 0)
            throw new IndexOutOfBoundsException("Index cannot be negative.");

        Node newNode = new Node(data);

        if (index == 0)
        {
            newNode.next = head;
            head = newNode;
        }
        else 
        {
            Node current = head;
            int currentIndex = 0;

            while (current != null && currentIndex < index - 1) {
                current = current.next;
                currentIndex++;
            }

            if (current == null)
                throw new IndexOutOfBoundsException("Index out of range.");

            newNode.next = current.next;
            current.next = newNode;
        }
    }

    // Deletion at specific index
    public void deleteAtIndex(int index) 
    {
        if (index < 0)
            throw new IndexOutOfBoundsException("Index cannot be negative.");

        if (head == null)
            throw new IndexOutOfBoundsException("List is empty.");

        if (index == 0)
        {
            head = head.next;
        }
        else 
        {
            Node current = head;
            int currentIndex = 0;

            while (current != null && currentIndex < index - 1)
            {
                current = current.next;
                currentIndex++;
            }

            if (current == null || current.next == null)
                throw new IndexOutOfBoundsException("Index out of range.");

            current.next = current.next.next;
        }
    }

    // Display the linked list
    public void display() 
    {
        Node current = head;
        while (current != null)
        {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

public class LinkedListInsertionDeletionFromSpecificDemo 
{
    public static void main(String[] args) 
    {
        LinkedList linkedList = new LinkedList();
        Scanner scanner = new Scanner(System.in);

        // Insertion at specific indexes
        System.out.print("Enter the number of elements to insert: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            
            System.out.print("Enter the element: ");
            int data = scanner.nextInt();
            
            System.out.print("Enter the index: ");
            int index = scanner.nextInt();

            linkedList.insertAtIndex(data, index);
            linkedList.display();
        }

        // Deleting elements at specific indexes
        System.out.println("========================================================");
        System.out.print("Enter the number of elements to delete: ");
        int m = scanner.nextInt();

        for (int i = 0; i < m; i++)
        {
            System.out.print("Enter the index to delete: ");
            int index = scanner.nextInt();

            linkedList.deleteAtIndex(index);
            linkedList.display();
        }
    }
}
