package Lab2;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class CircularQueueLinkedList {
    private Node front;
    private Node rear;
    private int count;

    public CircularQueueLinkedList() {
        this.front = this.rear = null;
        this.count = 0;
    }

    // Method to enqueue an element to the circular queue
    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (rear == null) {
            front = rear = newNode;
            rear.next = front; // Make it circular
        } else {
            rear.next = newNode;
            rear = newNode;
            rear.next = front; // Make it circular
        }
        count++;
        System.out.println("Enqueued " + data);
    }

    // Method to dequeue an element from the circular queue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return -1;
        }
        int data = front.data;
        if (front == rear) { // Only one element was present
            front = rear = null;
        } else {
            front = front.next;
            rear.next = front; // Maintain circular nature
        }
        count--;
        return data;
    }

    // Method to check if the circular queue is empty
    public boolean isEmpty() {
        return front == null;
    }

    // Method to check if the circular queue is full
    public boolean isFull() {
        // In a linked list implementation, the queue is never full unless out of memory
        return false;
    }

    // Method to return the front element of the circular queue
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return front.data;
    }

    // Method to return the size of the circular queue
    public int size() {
        return count;
    }

    public static void main(String[] args) {
        CircularQueueLinkedList queue = new CircularQueueLinkedList();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Front element is " + queue.peek());

        System.out.println("Dequeued element is " + queue.dequeue());
        System.out.println("Dequeued element is " + queue.dequeue());

        System.out.println("Queue empty: " + queue.isEmpty());
    }
}
