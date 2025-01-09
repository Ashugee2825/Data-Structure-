package Lab2;

public class Stack14 {
    private int[] arr;
    private int top;
    private int capacity;

    public Stack14(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        top = -1;
    }

    public void push(int value) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow: Cannot push element, stack is full.");
            return;
        }
        arr[++top] = value;
        System.out.println(value + " pushed to stack.");
    }

    public void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow: Cannot pop element, stack is empty.");
            return;
        }
        int poppedValue = arr[top--];
        System.out.println(poppedValue + " popped from stack.");
    }

    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.print("Elements in Stack: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Stack14 stk = new Stack14(10);

        stk.push(1);
        stk.push(2);
        stk.push(3);
        stk.display();

        stk.pop();
        stk.display();
    }
}
