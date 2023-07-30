import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;
import java.util.Scanner;

class Stack {
    private List<Integer> data;
    private int top;

    Stack() {
        data = new ArrayList<>();
        top = -1;
    }

    void push(int item) {
        data.add(item);
        top++;
    }

    int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int poppedItem = data.get(top);
        data.remove(top);
        top--;
        return poppedItem;
    }

    boolean isEmpty() {
        return top == -1;
    }

    int size() {
        return top + 1;
    }
}

public class CaseStudyMemoryManagement {
    public static void main(String[] args) {
        Stack stack = new Stack();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Custom Stack Program!");
        System.out.println();
        System.out.println("***************************************");

        // Pushing elements onto the stack
        System.out.print("Enter the first element to push: ");
        int element1 = scanner.nextInt();
        stack.push(element1);

        System.out.print("Enter the second element to push: ");
        int element2 = scanner.nextInt();
        stack.push(element2);

        System.out.print("Enter the third element to push: ");
        int element3 = scanner.nextInt();
        stack.push(element3);

        // Popping elements from the stack
        int poppedItem = stack.pop();
        System.out.println("Popped Item: " + poppedItem);

        // Displaying stack size
        System.out.println("Stack Size: " + stack.size());

        scanner.close();
    }
}
