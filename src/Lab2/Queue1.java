package Lab2;

public class Queue1 {
    private int[] arr;
    private int front, rear, size, capacity;

    public Queue1(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        front = rear = size = 0;
    }

    public void insertLast(int value) {
        if (rear == capacity) {
            System.out.println("Queue Overflow: Cannot insert element, queue is full.");
            return;
        }
        arr[rear++] = value;
        size++;
        System.out.println(value + " inserted at the end of the queue.");
    }

    public void insertFirst(int value) {
        if (front == 0) {
            System.out.println("Queue Overflow: Cannot insert element at beginning, queue is full.");
            return;
        }
        for (int i = rear; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = value;
        rear++;
        size++;
        System.out.println(value + " inserted at the beginning of the queue.");
    }

    public void insertAt(int value, int position) {
        if (position < 0 || position > size) {
            System.out.println("Invalid position to insert element.");
            return;
        }
        if (rear == capacity) {
            System.out.println("Queue Overflow: Cannot insert element, queue is full.");
            return;
        }
        for (int i = rear; i > position; i--) {
            arr[i] = arr[i - 1];
        }
        arr[position] = value;
        rear++;
        size++;
        System.out.println(value + " inserted at position " + position + " in the queue.");
    }

    public void display() {
        if (size == 0) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Elements in Queue: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queue1 q = new Queue1(10);

        q.insertLast(1);
        q.insertLast(2);
        q.insertLast(3);
        q.display();

        q.insertFirst(0);
        q.display();

        q.insertAt(5, 2);
        q.display();
    }
}
