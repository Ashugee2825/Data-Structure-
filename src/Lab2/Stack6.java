package Lab2;

class Stack6 {
    private int arr[];
    private int top;
    private int capacity;

    // Constructor to initialize the stack
    Stack6(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    // Function to add an element to the stack
    public void push(int x) {
        if (isFull()) {
            System.out.println("Stack Overflow");
            return;
        }
        System.out.println("Inserting " + x);
        arr[++top] = x;
    }

    // Function to pop an element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top--];
    }

    // Function to check if the stack is full
    public boolean isFull() {
        return top == capacity - 1;
    }

    // Function to check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Function to return the size of the stack
    public int size() {
        return top + 1;
    }

    // Function to return the top element of the stack
    public int peek() {
        if (!isEmpty()) {
            return arr[top];
        } else {
            System.out.println("Stack is empty");
            return -1;
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack(3);

        stack.push(1);    // Output: Inserting 1
        stack.push(2);    // Output: Inserting 2
        stack.push(3);    // Output: Inserting 3

        if (stack.isFull()) {
            System.out.println("Stack is full"); // Output: Stack is full
        } else {
            System.out.println("Stack is not full");
        }

        stack.pop();    // Removes the top element

        if (stack.isFull()) {
            System.out.println("Stack is full");
        } else {
            System.out.println("Stack is not full"); // Output: Stack is not full
        }
    }
}
