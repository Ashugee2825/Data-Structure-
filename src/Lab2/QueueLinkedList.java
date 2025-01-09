package Lab2;

class Node1 {
    int data;
    Node next;

    public Node1(int data) {
        this.data = data;
        this.next = null;
    }
}

class QueueLinkedList {
    private Node front;
    private Node rear;
    private int count;

    public QueueLinkedList() {
        this.front = this.rear = null;
        this.count = 0;
    }

    // Method to enqueue an element to the queue
    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        count++;
        System.out.println("Enqueued " + data);
    }

    // Method to dequeue an element from the queue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return -1;
        }
        int data = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        count--;
        return data;
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return front == null;
    }

    // Method to return the front element of the queue
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");				
            return -1;
        }
        return front.data;
    }

    // Method to return the size of the queue
    public int size() {
        return count;
    }

    public static void main(String[] args) {
        QueueLinkedList queue = new QueueLinkedList();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Front element is " + queue.peek());

        System.out.println("Dequeued element is " + queue.dequeue());
        System.out.println("Dequeued element is " + queue.dequeue());

        System.out.println("Queue empty: " + queue.isEmpty());
    }
}



