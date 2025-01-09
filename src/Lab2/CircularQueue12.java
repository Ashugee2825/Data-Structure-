package Lab2;


// 12. Program to Implement Circular Queue Using Array in Java


public class CircularQueue12 {
    private int[] arr;
    private int front, rear, size, capacity;

    public CircularQueue12(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        front = rear = size = 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue Overflow: Cannot enqueue element, circular queue is full.");
            return;
        }
        arr[rear] = value;
        rear = (rear + 1) % capacity;
        size++;
        System.out.println(value + " enqueued to circular queue.");
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow: Cannot dequeue element, circular queue is empty.");
            return;
        }
        int dequeuedValue = arr[front];
        front = (front + 1) % capacity;
        size--;
        System.out.println(dequeuedValue + " dequeued from circular queue.");
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Circular Queue is empty.");
            return;
        }
        System.out.print("Elements in Circular Queue: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[(front + i) % capacity] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CircularQueue12 cq = new CircularQueue12(5);

        cq.enqueue(1);
        cq.enqueue(2);
        cq.enqueue(3);
        cq.enqueue(4);
        cq.enqueue(5); // Trying to enqueue to full circular queue
        cq.display();

        cq.dequeue();
        cq.dequeue();
        cq.display();

        cq.enqueue(6);
        cq.enqueue(7);
        cq.display();
    }
}

