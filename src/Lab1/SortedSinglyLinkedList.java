package Lab1;

class SortedSinglyLinkedList {
    Node head;

    public SortedSinglyLinkedList() {
        this.head = null;
    }

    // Method to insert a node in sorted order
    public void insertSorted(int data) {
        Node newNode = new Node(data);
        if (head == null || head.data >= newNode.data) {
            newNode.next = head;
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null && current.next.data < newNode.data) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    // Method to display the list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        SortedSinglyLinkedList list = new SortedSinglyLinkedList();
        list.insertSorted(30);
        list.insertSorted(10);
        list.insertSorted(20);
        list.insertSorted(40);
        list.display(); // Output: 10 -> 20 -> 30 -> 40 -> null
    }
}
