package Lab2;
// 15. Write a program to implement queue using array. ?
public class Queue15 {
    private int[] arr;
    private int front, rear, capacity;

    public Queue15(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        front = rear = 0;
    }

    public void enqueue(int value) {
        if (rear == capacity) {
            System.out.println("Queue Overflow: Cannot enqueue element, queue is full.");
            return;
        }
        arr[rear++] = value;
        System.out.println(value + " enqueued to queue.");
    }

    public void dequeue() {
        if (front == rear) {
            System.out.println("Queue Underflow: Cannot dequeue element, queue is empty.");
            return;
        }
        int dequeuedValue = arr[front++];
        System.out.println(dequeuedValue + " dequeued from queue.");
    }

    public void display() {
        if (front == rear) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Elements in Queue: ");
        for (int i = front; i < rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queue15 q = new Queue15(10);

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.display();

        q.dequeue();
        q.display();
    }
}
