package queue;



//Class representing a queue implemented using an array
public class QueueArraycw {
 private int[] arr;       // Array to store queue elements
 private int front;       // Front points to the front element in the queue
 private int rear;        // Rear points to the last element in the queue
 private int capacity;    // Maximum capacity of the queue
 private int count;       // Current size of the queue

 // Constructor to initialize a queue
 public QueueArraycw(int size) {
     arr = new int[size];
     capacity = size;
     front = 0;
     rear = -1;
     count = 0;
 }

 // Utility function to dequeue the front element
 public void dequeue() {
     // Check for queue underflow
     if (isEmpty()) {
         System.out.println("Queue Underflow");
         return;
     }

     System.out.println("Removing " + arr[front]);

     front = (front + 1) % capacity;
     count--;
 }

 // Utility function to add an item to the queue
 public void enqueue(int item) {
     // Check for queue overflow
     if (isFull()) {
         System.out.println("Queue Overflow");
         return;
     }

     System.out.println("Inserting " + item);

     rear = (rear + 1) % capacity;
     arr[rear] = item;
     count++;
 }

 // Utility function to return the front element of the queue
 public int peek() {
     if (isEmpty()) {
         System.out.println("Queue Underflow");
         System.exit(-1);
     }
     return arr[front];
 }

 // Utility function to return the size of the queue
 public int size() {
     return count;
 }

 // Utility function to check if the queue is empty or not
 public boolean isEmpty() {
     return (size() == 0);
 }

 // Utility function to check if the queue is full or not
 public boolean isFull() {
     return (size() == capacity);
 }

 public static void main(String[] args) {
     // Create a queue of capacity 5
     QueueArraycw q = new QueueArraycw(5);

     q.enqueue(1);
     q.enqueue(2);
     q.enqueue(3);
     q.enqueue(4);
     q.enqueue(5);

     System.out.println("Front element is: " + q.peek());
     q.dequeue();
     System.out.println("Front element is: " + q.peek());

     System.out.println("Queue size is " + q.size());

     q.dequeue();
     q.dequeue();
     q.dequeue();
     q.dequeue();

     if (q.isEmpty()) {
         System.out.println("Queue is empty");
     } else {
         System.out.println("Queue is not empty");
     }
 }
}
