package queue;



//Node class to represent each element in the linked list
class Node {
 int data;
 Node next;

 public Node(int data) {
     this.data = data;
     this.next = null;
 }
}

//Queue class to implement the queue using linked list
public class QueueLinkedList {
 private Node front;  // Front points to the front node in the queue
 private Node rear;   // Rear points to the last node in the queue
 private int count;   // Current size of the queue

 // Constructor to initialize a queue
 public QueueLinkedList() {
     front = null;
     rear = null;
     count = 0;
 }

 // Method to add an item to the queue
 public void enqueue(int item) {
     Node newNode = new Node(item);
     if (isEmpty()) {
         front = newNode;
     } else {
         rear.next = newNode;
     }
     rear = newNode;
     count++;
     System.out.println("Inserting " + item);
 }

 // Method to remove the front item from the queue
 public void dequeue() {
     if (isEmpty()) {
         System.out.println("Queue Underflow");
         return;
     }
     System.out.println("Removing " + front.data);
     front = front.next;
     count--;

     if (isEmpty()) {
         rear = null;
     }
 }

 // Method to return the front item of the queue
 public int peek() {
     if (isEmpty()) {
         System.out.println("Queue Underflow");
         System.exit(-1);
     }
     return front.data;
 }

 // Method to return the size of the queue
 public int size() {
     return count;
 }

 // Method to check if the queue is empty
 public boolean isEmpty() {
     return (front == null);
 }

 // Method to display the elements of the queue
 public void display() {
     if (isEmpty()) {
         System.out.println("Queue is empty");
         return;
     }

     Node current = front;
     while (current != null) {
         System.out.print(current.data + " -> ");
         current = current.next;
     }
     System.out.println("null");
 }

 public static void main(String[] args) {
     // Create a queue
     QueueLinkedList queue = new QueueLinkedList();

     queue.enqueue(1);
     queue.enqueue(2);
     queue.enqueue(3);
     queue.enqueue(4);
     queue.enqueue(5);

     queue.display(); // Output: 1 -> 2 -> 3 -> 4 -> 5 -> null

     System.out.println("Front element is: " + queue.peek());
     queue.dequeue();
     System.out.println("Front element is: " + queue.peek());

     queue.display(); // Output: 2 -> 3 -> 4 -> 5 -> null

     System.out.println("Queue size is " + queue.size());

     queue.dequeue();
     queue.dequeue();
     queue.dequeue();
     queue.dequeue();

     queue.display(); // Output: Queue is empty

     if (queue.isEmpty()) {
         System.out.println("Queue is empty");
     } else {
         System.out.println("Queue is not empty");
     }
 }
}
