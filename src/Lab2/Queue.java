package Lab2;

class Queue {
    private int arr[];
    private int front;
    private int rear;
    private int capacity;
    private int count;

    // Constructor to initialize the queue
    Queue(int size) {
        arr = new int[size];
        capacity = size;
        front = 0;
        rear = -1;
        count = 0;
    }

    // Function to add an element to the queue
    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue Overflow");
            return;
        }
        rear = (rear + 1) % capacity;
        arr[rear] = item;
        count++;
        System.out.println("Inserted " + item);
    }

    // Function to remove an element from the queue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return -1;
        }
        int item = arr[front];
        front = (front + 1) % capacity;
        count--;
        return item;
    }

    // Function to check if the queue is full
    public boolean isFull() {
        return count == capacity;
    }

    // Function to check if the queue is empty
    public boolean isEmpty() {
        return count == 0;
    }

    // Function to return the size of the queue
    public int size() {
        return count;
    }

    // Function to return the front element of the queue
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front];
    }

    public static void main(String[] args) {
        Queue queue = new Queue(3);

        queue.enqueue(1);    // Output: Inserted 1
        queue.enqueue(2);    // Output: Inserted 2
        queue.enqueue(3);    // Output: Inserted 3

        if (queue.isFull()) {
            System.out.println("Queue is full"); // Output: Queue is full
        } else {
            System.out.println("Queue is not full");
        }

        queue.dequeue();    // Removes the front element

        if (queue.isFull()) {
            System.out.println("Queue is full");
        } else {
            System.out.println("Queue is not full"); // Output: Queue is not full
        }

        if (queue.isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Queue is not empty"); // Output: Queue is not empty
        }

        queue.dequeue();    // Removes the front element
        queue.dequeue();    // Removes the front element

        if (queue.isEmpty()) {
            System.out.println("Queue is empty"); // Output: Queue is empty
        } else {
            System.out.println("Queue is not empty");
        }
    }
}
